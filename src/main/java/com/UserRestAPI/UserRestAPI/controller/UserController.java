package com.UserRestAPI.UserRestAPI.controller;

import com.UserRestAPI.UserRestAPI.entity.User;
import com.UserRestAPI.UserRestAPI.exception.NotFoundException;
import com.UserRestAPI.UserRestAPI.model.dto.UserDto;
import com.UserRestAPI.UserRestAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ResponseEntity<?> getListUser() {
        List<UserDto> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}") //tên của param phải giống với tên biến mặc định
    public  ResponseEntity<?> getUsetById(@PathVariable int id) throws  ClassNotFoundException {
        UserDto result = userService.getUserById(id);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchUser(@RequestParam(name = "Keyword" , required = false , defaultValue = "") String name) {
        List<UserDto> users = userService.searchUser(name);

        return  ResponseEntity.ok(users);
    }

    @PostMapping("")
    public ResponseEntity<?> createUser() {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser() {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser() {
        return null;
    }
}
