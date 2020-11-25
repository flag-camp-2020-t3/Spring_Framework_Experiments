package com.spare4fun.core.service;

import com.spare4fun.core.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UUIDAuthenticationService {
    @Autowired
    private InMemoryUsers userService;

    public Optional<String> login(final String username, final String password) {
        final String uuid = UUID.randomUUID().toString();
        final User user = User
                .builder()
                .id(uuid)
                .username(username)
                .password(password)
                .build();

        userService.save(user);
        return Optional.of(uuid);
    }

    public Optional<User> findByToken(final String token) {
        return userService.find(token);
    }

    public void logout(final User user) {

    }
}
