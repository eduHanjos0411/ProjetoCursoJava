package com.dudu.ProjetoCursoJava.Order;

import java.time.Instant;

import com.dudu.ProjetoCursoJava.User.User;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tb_order")
public class Order {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;

    private Integer orderStatus;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private User client;
    
    public Order() {
    }


    public Order(Instant moment, OrderStatus status, User client) {
        super();
        this.moment = moment;
        setOrderStatus(status);
        this.client = client;
    }



    public Order(Long id, Instant moment, OrderStatus status, User client) {
        super();
        this.id = id;
        this.moment = moment;
        setOrderStatus(status);
        this.client = client;
    }

    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        if (orderStatus != null) {
            this.orderStatus = orderStatus.getCode();
        }

    }
}
