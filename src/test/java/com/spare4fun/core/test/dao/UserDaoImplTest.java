package com.spare4fun.core.test.dao;

import com.spare4fun.core.dao.UserDaoImpl;
import com.spare4fun.core.entity.Role;
import com.spare4fun.core.entity.User;
import com.spare4fun.core.exception.DuplicateUserException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class UserDaoImplTest {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserDaoImpl userDaoImpl;

    @BeforeTestMethod
    public void setup() {
        dummyUsers()
                .stream()
                .forEach(user -> {
                    try {
                        userDaoImpl.addUser(user);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
    }

    private Set<User> dummyUsers() {
        Set<User> dummyUsers = new HashSet<>();
        User alice = User
                .builder()
                .email("alicewillbe@gmail.com")
                .password(passwordEncoder.encode("pass"))
                .role(Role.ADMIN)
                .enabled(true)
                .build();
        dummyUsers.add(alice);

        User jin = User
                .builder()
                .email("jin@gmail.com")
                .password(passwordEncoder.encode("pass"))
                .role(Role.USER)
                .enabled(true)
                .build();
        dummyUsers.add(jin);
        return dummyUsers;
    }

    @Test
    public void testAddUser() {
        // cannot add duplicate user with same username
        dummyUsers()
                .stream()
                .findFirst()
                .ifPresent(
                        user -> {
                            assertThrows(DuplicateUserException.class, () -> {
                                userDaoImpl.addUser(user);
                            });
                        }
                );
    }

    @Test
    public void contextLoad() {
        assertThat(userDaoImpl).isNotNull();
    }
}
