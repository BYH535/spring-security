/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.security.init.services;

import com.spring.security.init.models.Authority;

/**
 *
 * @author hbenyahia
 */
public interface AuthorityService {

    public Authority findByName(String name);
    
    public Authority save(Authority authority);
    
    public void wipeOut();
}
