package com.test.study.controller;

import com.test.study.dto.request.CreateUser;
import com.test.study.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity singUp(@RequestBody CreateUser createUser){
        userService.createUser(createUser);
        return ResponseEntity.status(HttpStatus.CREATED).body("가입 성공");
    }

    @GetMapping("/{id}")
    public ResponseEntity viewUser(@RequestParam Long id){
        return ResponseEntity.ok(userService.getUser(id));
    }
}