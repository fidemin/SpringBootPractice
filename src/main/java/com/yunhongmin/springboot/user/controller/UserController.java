package com.yunhongmin.springboot.user.controller;

import com.yunhongmin.springboot.user.model.User;
import com.yunhongmin.springboot.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @GetMapping("/all")
    public ResponseEntity<List<User>> findAll(HttpServletRequest request) {
        List<User> allUsers = userRepository.findAll();
        return ResponseEntity.ok(allUsers);
    }
}
