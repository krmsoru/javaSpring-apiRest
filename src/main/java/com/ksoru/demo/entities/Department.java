package com.ksoru.demo.entities;
import lombok.Getter;
import lombok.Setter;

public class Department {
    @Getter @Setter
    private Long id;

    @Getter@Setter
    private String name;

    public Department(){};

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}





