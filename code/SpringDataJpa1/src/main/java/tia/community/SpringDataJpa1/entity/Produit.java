package tia.community.SpringDataJpa1.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "produits")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private  Double price;

    private String category;

    private boolean disponible;

    private int stock;

    private LocalDate dateCreation;

    public Produit() {
    }

    public Produit(Long id, String name, Double price, String category, boolean disponible, int stock, LocalDate dateCreation) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.disponible = disponible;
        this.stock = stock;
        this.dateCreation = dateCreation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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


    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", disponible=" + disponible +
                ", stock=" + stock +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
