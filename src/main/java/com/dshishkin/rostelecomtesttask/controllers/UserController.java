package com.dshishkin.rostelecomtesttask.controllers;

import com.dshishkin.rostelecomtesttask.dto.UserDto;
import com.dshishkin.rostelecomtesttask.services.interf.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/user")
public class UserController {
    private final UserService userService;

    @PostMapping()
    public ResponseEntity<String> addUser(@RequestBody UserDto user) {
        try {
            userService.addUser(user.toUser());
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("что то пошло не так");
        }

    }

}
