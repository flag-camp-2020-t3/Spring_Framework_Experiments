package com.spare4fun.core.service;

import com.spare4fun.core.entity.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import static java.util.Optional.ofNullable;
import java.util.Objects;

@Service
public class InMemoryUsers {
    Map<String, User> users = new HashMap<>();

    public User save(final User user) {
        return users.put(user.getId(), user);
    }

    public Optional<User> find(final String id) {
        return ofNullable(users.get(id));
    }

    public Optional<User> findByUsername(final String username) {
        return users
                .values()
                .stream()
                .filter(u -> Objects.equals(username, u.getUsername()))
                .findFirst();
    }
}
