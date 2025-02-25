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

    @OneToMany(cascade = CascadeType.ALL)
    private List<Account> accounts;


    public User() {
        this.accounts = new ArrayList<>();
    }

    public User(String username, int age, List<Account> accounts) {
        this.username = username;
        this.age = age;
        this.accounts = accounts;
    }
}
