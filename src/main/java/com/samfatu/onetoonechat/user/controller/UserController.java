package com.samfatu.onetoonechat.user.controller;

import com.samfatu.onetoonechat.user.entity.User;
import com.samfatu.onetoonechat.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping()
    public ResponseEntity<?> createUser(@RequestBody String name) {
        userService.createUser(name);
        return ResponseEntity.ok("User with name " + name + " has been created");
    }
}
