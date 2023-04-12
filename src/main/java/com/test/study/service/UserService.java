package com.test.study.service;


import com.test.study.convert.UserConvert;
import com.test.study.domain.User;
import com.test.study.dto.request.CreateUser;
import com.test.study.dto.response.ReadUser;
import com.test.study.repository.UserRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserConvert userConvert;

    public void createUser(CreateUser createUser){
        userRepository.save(userConvert.convertUser(createUser.getName(), createUser.getAge()));
    }

    public ReadUser getUser(Long id){
        Optional<User> user = userRepository.findById(id);
        return userConvert.convertReadUser(user.get().getId(), user.get().getName(), user.get()
            .getAge());
    }
}
