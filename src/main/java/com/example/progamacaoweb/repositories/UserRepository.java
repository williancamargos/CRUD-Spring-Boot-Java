package com.example.progamacaoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.progamacaoweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
