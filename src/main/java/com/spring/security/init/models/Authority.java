/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.security.init.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author hbenyahia
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Authority implements Serializable, GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuthority;
    
    private String name;

    @Override
    public String getAuthority() {
        return this.name;
    }

    public Authority(Long idAuthority, String name) {
        this.idAuthority = idAuthority;
        this.name = name;
    }

}
