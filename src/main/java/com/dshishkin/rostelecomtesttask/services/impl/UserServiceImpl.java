package com.dshishkin.rostelecomtesttask.services.impl;

import com.dshishkin.rostelecomtesttask.model.User;
import com.dshishkin.rostelecomtesttask.repositories.UserRepository;
import com.dshishkin.rostelecomtesttask.services.interf.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public void addUser(User user) {
        userRepository.save(user);
    }
}
