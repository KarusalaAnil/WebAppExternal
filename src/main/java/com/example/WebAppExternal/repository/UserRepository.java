package com.example.WebAppExternal.repository;

import com.example.WebAppExternal.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserInfo,Integer> {
    Optional<UserInfo> findByName(String username);
}
