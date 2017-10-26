package com.example.demo.dao;

import com.example.demo.entry.user;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@CacheConfig(cacheNames = "user")
public interface UserRepository  extends JpaRepository<user, Long> {

    user findByName(String name);
}
