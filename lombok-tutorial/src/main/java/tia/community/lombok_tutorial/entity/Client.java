package tia.community.lombok_tutorial.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Mohammed Ezzaim
 **/

@Entity
@Table(name = "clients")
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter
    private String ref;

    @Getter @Setter
    private String firstName;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    @Column(columnDefinition = "Text")
    private String address;

    public Client(String ref) {
        this.ref = ref;
    }
}
