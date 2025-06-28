package tia.community.architecture_en_Couche_1.entity;


import jakarta.persistence.*;

/**
 @author Ezzaim Mohammed
 **/

@Entity
@Table(name = "produit_3ia")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name_produit")
    private String name;

    @Column(name = "prix_produit")
    private double price;

    public Produit(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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
}

