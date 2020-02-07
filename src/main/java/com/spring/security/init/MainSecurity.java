/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.security.init;

import com.spring.security.init.models.Authority;
import com.spring.security.init.services.AuthorityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author hbenyahia
 */
@SpringBootApplication
public class MainSecurity {

    public static void main(String[] args) {
        SpringApplication.run(MainSecurity.class, args);
    }

    @Bean
    public CommandLineRunner demoData(AuthorityService authorityService) {
        return (String[] args) -> {
            authorityService.wipeOut();
            authorityService.save(new Authority(new Long(2), "ROLE_USER"));
            authorityService.save(new Authority(new Long(3), "ROLE_ADMIN"));
        };
    }
}
