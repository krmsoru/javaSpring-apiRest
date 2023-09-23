package com.ksoru.demo.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Product {
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private Double price;
    @Getter @Setter
    private Department department;

    public Product(){

    };

    public Product(Long id, String name, Double price, Department department) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.department = department;
    }
}
