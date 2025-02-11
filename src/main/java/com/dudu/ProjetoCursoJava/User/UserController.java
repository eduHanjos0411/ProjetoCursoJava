package com.dudu.ProjetoCursoJava.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {


    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1, "dudu", "dudu@gmail.com", "12345678", "99999999");
        return ResponseEntity.ok().body(user);
    }
}
