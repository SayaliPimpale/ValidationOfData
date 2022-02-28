package com.valid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valid.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
