package com.example.demo.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
//无参构造器
@AllArgsConstructor
//有参构造器
public @Data class user {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String password;

}
