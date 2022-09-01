package com.samfatu.onetoonechat.user.service;

import com.samfatu.onetoonechat.user.entity.User;
import com.samfatu.onetoonechat.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    private static final String USER_DOES_NOT_EXISTS_MESSAGE = "User with given id not exists!";

    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(USER_DOES_NOT_EXISTS_MESSAGE));
    }

    public void createUser(String name) {
        User user = new User(name);
        userRepository.save(user);
    }
}
