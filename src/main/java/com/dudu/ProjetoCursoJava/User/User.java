package com.dudu.ProjetoCursoJava.User;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode 
public class User implements Serializable {

    private long id;
    private String name;
    private String email;
    private String password;
    private String phone;
    
    public User() {
    }

    public User(long id, String name, String email, String password, String phone) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    
}
