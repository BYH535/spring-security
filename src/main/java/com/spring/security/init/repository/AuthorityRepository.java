/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.security.init.repository;

import com.spring.security.init.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hbenyahia
 */
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    public Authority findByName(String name);
}
