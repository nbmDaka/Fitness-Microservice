package com.example.Fitness_userservice.service;

import com.example.Fitness_userservice.dto.RegisterRequest;
import com.example.Fitness_userservice.dto.UserResponse;
import com.example.Fitness_userservice.model.User;
import com.example.Fitness_userservice.repository.UserRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private  UserRepository userRepository;

    public UserResponse register(@Valid RegisterRequest request) {

//        if(userRepository.existsByEmail(request.getEmail())) {
//            throw new IllegalArgumentException("Email already exists");
//        }

        User user = new User();
//        user.setEmail(request.getEmail());
//        user.setPassword(request.getPassword());
//        user.setFirstName(request.getFirstName());
//        user.setLastName(request.getLastName());

        User saveUser = userRepository.save(user);
        UserResponse userResponse = new UserResponse();
//        userResponse.setId(saveUser.getId());
//        userResponse.setEmail(saveUser.getEmail());
//        userResponse.setFirstName(saveUser.getFirstName());
//        userResponse.setLastName(saveUser.getLastName());
//        userResponse.setCreatedAt(saveUser.getCreatedAt());
//        userResponse.setUpdatedAt(saveUser.getUpdatedAt());

        return userResponse;
    }

//    public UserResponse getUserProfile(String userId) {
//    }

}
