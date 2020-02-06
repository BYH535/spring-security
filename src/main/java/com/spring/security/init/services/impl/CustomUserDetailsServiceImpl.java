/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.security.init.services.impl;

import com.spring.security.init.services.UserAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author hbenyahia
 */
public class CustomUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserAppService userAppService;

    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        return this.userAppService.findByUsername(string);
    }

}
