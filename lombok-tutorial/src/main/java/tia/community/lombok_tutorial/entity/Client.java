package tia.community.lombok_tutorial.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author Mohammed Ezzaim
 **/

@Entity
@Table(name = "clients")
@Data
@EqualsAndHashCode(exclude = {"id", "ref"})
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private final String ref;

    private final String firstName;

    private final String lastName;

    @Column(columnDefinition = "Text")
    private final String address;

    private final String role;

    public static ClientBuilder builder(){
        return new ClientBuilder();
    }
}
