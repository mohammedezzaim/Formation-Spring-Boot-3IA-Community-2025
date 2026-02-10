package tia.community.lombok_tutorial.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

/**
 * @author Mohammed Ezzaim
 **/

@Entity
@Table(name = "commands")
@RequiredArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString(includeFieldNames = false, exclude = {"id", "ref"})
public class Command  {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    private String ref;

    @NonNull
    private Double price;

    @NonNull
    private String refProduct;

    @NonNull
    private String refClient;

    @CreationTimestamp
    private LocalDateTime dateCreation;

    @UpdateTimestamp
    private LocalDateTime lastUpdate;
}
