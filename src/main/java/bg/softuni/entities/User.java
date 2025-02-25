package bg.softuni.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String username;

    @Basic
    private int age;

    @OneToMany
    private List<Account> accounts;


    public User() {
        this.accounts = new ArrayList<>();
    }
}
