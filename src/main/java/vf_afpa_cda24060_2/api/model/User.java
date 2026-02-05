package vf_afpa_cda24060_2.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name="id_user")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idUser;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="email")
    private String email;

    @Column(name="phone")
    private String phone;

    @Column(name="password_hash")
    private String password;
}
