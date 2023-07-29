package com.example.demo.controllers;

import com.example.demo.dto.UserRequest;
import com.example.demo.dto.UserResponse;

import com.example.demo.models.User;

import com.example.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("api/user")
public class UserController {
    @Autowired
    public UserServices userService;

    @PostMapping("/user")
    public User addUser (@RequestBody User s){
        return userService.addUser (s);

    }

    @PostMapping("/user/login")
    public ResponseEntity<UserResponse> login(@RequestBody UserRequest request){
        User user = userService.getLogin(request.getUsername() , request.getPassword());

        if( user!= null){
            UserResponse response = new UserResponse();
            response.setName(user.getName());
            response.setId(user.getId());
            response.setRole(user.getRole());
            return ResponseEntity.ok(response);

        }else{
            UserResponse userResponse = new UserResponse();
            userResponse.setRole(null);
            userResponse.setId(700);
            userResponse.setName(null);
            return  ResponseEntity.ok(userResponse);
        }

    }
    @GetMapping("/user")
    public List<User> getAll() {
        return userService.getAll();

    }
    @GetMapping("/user/{id}")
    public Optional<User> getById(@PathVariable Long id){
        return userService.findById(id);
    }
    @PutMapping("/user/{id}")
    public User updateUser(@RequestBody User s, @PathVariable Long id){
        s.setId(id);
        return userService.addUser(s);
    }
    @DeleteMapping("/user/{id}")
    public void deleteMe(@PathVariable Long id){
        userService.deleteById(id);
    }

}
