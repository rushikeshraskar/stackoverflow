package com.rushikesh.authentication.app.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SecurityAdapter extends WebSecurityConfigurerAdapter {

    @Bean
    @Override
    public UserDetailsService userDetailsServiceBean() throws Exception {
        List<UserDetails> users = new ArrayList<UserDetails>();
        users.add(User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin")
                .roles("ADMIN")
                .build());

        users.add(User.withDefaultPasswordEncoder()
                .username("rushikesh")
                .password("rushikesh")
                .roles("USER")
                .build());
        return new InMemoryUserDetailsManager(users);
    }
}
