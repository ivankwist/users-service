package com.pd2undav.usersservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/user")
    public ResponseEntity<User> getUserById(@RequestParam(value = "userID") String userID) {
        User user = userRepository.findById(userID).orElse(new User());

        log.info("Found User: {}", user.toString());

        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
