package com.samfatu.onetoonechat.configuration;

import com.samfatu.onetoonechat.user.entity.User;
import com.samfatu.onetoonechat.user.repository.UserRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class DatabasePopulator {

    private final UserRepository userRepository;

    public DatabasePopulator(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void populate() {
        if (!userRepository.existsById(1L)) {
            User user = new User("Mustafa Can Genc");
            userRepository.save(user);
        }

        if (!userRepository.existsById(2L)) {
            User user = new User("Serdar Ortac");
            userRepository.save(user);
        }

        if (!userRepository.existsById(3L)) {
            User user = new User("Can Yaman");
            userRepository.save(user);
        }

        if (!userRepository.existsById(4L)) {
            User user = new User("Bilgecan Dede");
            userRepository.save(user);
        }
    }
}
