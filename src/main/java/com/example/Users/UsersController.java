package com.example.Users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UsersController {
    private final UsersService usersService;

    @GetMapping("/write")
    String write(){
        return "write";
    }

    @PostMapping("/create")
    String createuser( String username, String password, String email) {
        usersService.createUser(username, password, email);
        return "redirect:/";
    }
}
