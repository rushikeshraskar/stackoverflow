package com.stackoverflow.configuration;

import com.stackoverflow.DAO.UserActionsDAO;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.stackoverflow.DAO")
public class AppConfiguration {

    private static final Logger LOG = LoggerFactory.getLogger(AppConfiguration.class.getName());

    @Autowired
    DataSource dataSource;

    @Autowired
    private ResourceLoader resourceLoader;

    SqlSessionFactoryBean sqlSessionFactoryBean;

    @Bean("userActionsDAO")
    public MapperFactoryBean<UserActionsDAO> getUserActionsDAO() throws Exception {
        MapperFactoryBean factoryBean = new MapperFactoryBean<>();
        factoryBean.setMapperInterface(UserActionsDAO.class);
        factoryBean.setSqlSessionFactory(getSqlSessionFactory().getObject());
        return factoryBean;
    }

    @Bean
    public SqlSessionFactoryBean getSqlSessionFactory() throws Exception {
        if(this.sqlSessionFactoryBean==null) {
            SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
            sqlSessionFactory.setDataSource(getDataSource());
            sqlSessionFactory.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
            sqlSessionFactory.setMapperLocations(ResourcePatternUtils.getResourcePatternResolver(resourceLoader).getResources("classpath:mappers/*.xml"));
            this.sqlSessionFactoryBean = sqlSessionFactory;
        }
        return this.sqlSessionFactoryBean;
    }


    private DataSource getDataSource() {
        return dataSource;
    }
}
