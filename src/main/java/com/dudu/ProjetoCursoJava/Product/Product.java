package com.dudu.ProjetoCursoJava.Product;

import java.util.HashSet;
import java.util.Set;

import com.dudu.ProjetoCursoJava.category.Category;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity @Data @Table(name = "tb_product")
public class Product {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long id;

    private String name;
    private String description;
    private Double price;
    private String imgUrl;
    
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @Setter(AccessLevel.NONE)
    @Transient
    private Set<Category> categories = new HashSet<>();

    public Product() {

    }

    public Product(long id, String name, String description, Double price, String imgUrl) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }


    public Product(String name, String description, Double price, String imgUrl) {
        super();
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }
}
