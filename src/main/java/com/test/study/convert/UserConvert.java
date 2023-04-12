package com.test.study.convert;

import com.spring_boot_test_study.core.domain.User;
import com.spring_boot_test_study.core.dto.response.ReadUser;
import com.test.study.domain.User;
import com.test.study.dto.response.ReadUser;
import org.springframework.stereotype.Component;

@Component
public class UserConvert {

    public User convertUser(String name, int age){
        return new User(name, age);
    }

    public ReadUser convertReadUser(Long id, String name, int age){
        return ReadUser.builder()
            .id(id)
            .name(name)
            .age(age)
            .build();
    }
}
