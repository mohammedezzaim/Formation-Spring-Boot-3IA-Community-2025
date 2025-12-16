package com.mff.crudProject.entity;

import jakarta.persistence.*;

/**
 * @author Mohammed Ezzaim
 **/

@Entity
@Table(name = "products")
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nameOfProduct")
    private String name;

    private Double price;

    private String category;

    private boolean dispo;

    public Product() {
    }

    public Product(String name, Double price, String category, boolean dispo) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.dispo = dispo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }
}
