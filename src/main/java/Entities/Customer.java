package Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String name;
    private String phoneNumber;
    private String road;
    private int houseNumber;
    private String floorAndNumber;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    private Set<Budget> budgets = new HashSet<>();

}
