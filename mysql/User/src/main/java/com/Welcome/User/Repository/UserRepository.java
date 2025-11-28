package com.Welcome.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Welcome.User.Entity.*;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByFirstname(String firstname);
}