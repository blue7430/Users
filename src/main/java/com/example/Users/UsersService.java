package com.example.Users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository usersRepository;

    public void createUser(String username, String password, String email) {
        for (int i = 0; i < 10000; i++) {
            Users users = new Users();
            users.setUsername(username);
            users.setPassword(password);
            users.setEmail(email);
            usersRepository.save(users);
        }
    }
}