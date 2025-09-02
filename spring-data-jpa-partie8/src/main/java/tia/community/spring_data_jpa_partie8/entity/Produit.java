package tia.community.spring_data_jpa_partie8.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "produits")
public class Produit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double price;
    private String category;
    private boolean disponible;
    private int stock;
    private LocalDate dateCreation;

    public Produit() {
    }

    public Produit(Integer id, String name, double price, String category, boolean disponible, int stock, LocalDate dateCreation) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.disponible = disponible;
        this.stock = stock;
        this.dateCreation = dateCreation;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String affaiche() {
        return "Name: "+name+", "+ "Price: "+price;
    }
}
