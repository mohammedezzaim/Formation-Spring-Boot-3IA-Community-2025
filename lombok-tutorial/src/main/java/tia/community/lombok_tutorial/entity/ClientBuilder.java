package tia.community.lombok_tutorial.entity;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Mohammed Ezzaim
 **/
@NoArgsConstructor
@AllArgsConstructor
public class ClientBuilder {
    private  String ref;

    private String firstName;

    private String lastName;

    private String address;

    private String role = "client";

    public ClientBuilder ref(String ref) {
        this.ref = ref;
        return this;
    }

    public ClientBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ClientBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ClientBuilder address(String address) {
        this.address = address;
        return this;
    }

    public ClientBuilder role(String role) {
        this.role = role;
        return this;
    }

    public Client build() {
        return new Client(ref, firstName, lastName, address, role);
    }
}
