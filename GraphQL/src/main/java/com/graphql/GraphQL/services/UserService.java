package com.graphql.GraphQL.services;

import com.graphql.GraphQL.Repo.UserRepo;
import com.graphql.GraphQL.models.User;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User createUser(User user) {
        return userRepo.save(user);
    }
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
//    public Optional<User> getUserById(int id) {
//       return userRepo.findById(id);
//    }

    public User getUserById(int id) {
        return userRepo.findById(id).orElseThrow(()-> new RuntimeException("Resource not found exception"));
    }
}
