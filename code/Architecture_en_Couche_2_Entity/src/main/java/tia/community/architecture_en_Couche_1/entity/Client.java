package tia.community.architecture_en_Couche_1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author Ezzaim Mohammed
 **/

@Entity
public class Client {

    @Id
    private Integer id;

    @Column(name = "identifient")
    private String num_cart_nationale;


    private String name;

    @Column(name = "telephone")
    private String tele;
}
