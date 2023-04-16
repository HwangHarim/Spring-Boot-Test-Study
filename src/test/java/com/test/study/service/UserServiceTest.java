package com.test.study.service;

import static org.junit.jupiter.api.Assertions.*;

import com.test.study.domain.User;
import com.test.study.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    UserService userService;

    @Mock
    UserRepository userRepository;

    @Test
    void getUser() {
        User user = new User();
        user.setAge();
    }
}