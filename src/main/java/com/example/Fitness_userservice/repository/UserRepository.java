package com.example.Fitness_userservice.repository;

import com.example.Fitness_userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    public User findByEmail(String email);

}
