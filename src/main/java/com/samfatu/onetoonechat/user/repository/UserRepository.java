package com.samfatu.onetoonechat.user.repository;

import com.samfatu.onetoonechat.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(Long id);
    boolean existsById(Long id);
}
