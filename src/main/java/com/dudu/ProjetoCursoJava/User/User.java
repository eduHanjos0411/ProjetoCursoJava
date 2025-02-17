package com.dudu.ProjetoCursoJava.User;

import java.util.ArrayList;
import java.util.List;

import com.dudu.ProjetoCursoJava.Order.Order;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;


@Data
@Entity
@Table(name="tb_user")
public class User{

    //instance of Id and autogenerate it on database
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;
    private String password;
    private String phone;    

    //not generate setter for the collection collection
    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy ="client")
    @JsonIgnore
    private List<Order> orders = new ArrayList<Order>();

    public User() {
    }



    public User(String name, String email, String password, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
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
