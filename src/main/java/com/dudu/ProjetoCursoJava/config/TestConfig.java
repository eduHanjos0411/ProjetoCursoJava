package com.dudu.ProjetoCursoJava.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dudu.ProjetoCursoJava.User.User;
import com.dudu.ProjetoCursoJava.User.UserRepository;

@Configuration @Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User("Maria", "maria@gmail.com", "1234578", "99999912");
        User u2 = new User("Alex", "alex@gmail.com", "87654321", "7654321");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }


}
