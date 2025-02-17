package com.dudu.ProjetoCursoJava.category;

import java.util.HashSet;
import java.util.Set;

import com.dudu.ProjetoCursoJava.Product.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity @Data @Table(name = "tb_category")
public class Category {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "categories")
    @JsonIgnore
    @Transient
    private Set<Product> products = new HashSet<>();

    public Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    
}
