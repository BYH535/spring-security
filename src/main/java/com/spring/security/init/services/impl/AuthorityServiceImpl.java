/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.security.init.services.impl;

import com.spring.security.init.models.Authority;
import com.spring.security.init.repository.AuthorityRepository;
import com.spring.security.init.services.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hbenyahia
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityRepository authorityDAO;

    @Override
    public Authority findByName(String name) {
        return this.authorityDAO.findByName(name);
    }
    
    @Override
    public Authority save(Authority authority) {
        return this.authorityDAO.save(authority);
    }
    
    @Override
    public void wipeOut(){
        this.authorityDAO.deleteAll();
    }

}
