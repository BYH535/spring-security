package com.spring.security.init.services;

import com.spring.security.init.models.UserApp;

public interface UserAppService {

    public UserApp findByUsername(String username);

}
