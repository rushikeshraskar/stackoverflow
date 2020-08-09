package com.stackoverflow;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;


@SpringBootApplication
public class AppMain {

    private static final Logger LOG = LoggerFactory.getLogger(AppMain.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(AppMain.class);
    }

}
