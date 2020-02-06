/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.security.init.services.impl;

import com.spring.security.init.models.UserApp;
import com.spring.security.init.repository.UserAppRepository;
import com.spring.security.init.services.UserAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hbenyahia
 */
@Service
public class UserAppServiceImpl implements UserAppService {

    @Autowired
    private UserAppRepository userAppDAO;

    @Override
    public UserApp findByUsername(String username) {
        return this.userAppDAO.findByUsername(username);
    }

}
