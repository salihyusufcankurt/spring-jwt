package com.project.jwtapp.services;

import com.project.jwtapp.entities.User;
import com.project.jwtapp.repos.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveOneUser(User newUser) {
        return userRepository.save(newUser);
    }

    public User getOneUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User updateOneUser(int userId, User newUser) {
        Optional<User> user = userRepository.findById(userId);
        if(user.isPresent()) {
            User foundUser = user.get();
            foundUser.setUsername(newUser.getUsername());
            foundUser.setPassword(newUser.getPassword());
            userRepository.save(foundUser);
            return foundUser;
        }else
            return null;
    }

    public void deleteById(int userId) {
        userRepository.deleteById(userId);
    }

    public User getOneUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }


}