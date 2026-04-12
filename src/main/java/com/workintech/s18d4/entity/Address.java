package com.workintech.s18d4.entity;

import jakarta.persistence.*;
import jakarta.persistence.OneToOne;
import com.workintech.s18d4.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Entity
@Table(name="address")
public class Address {
    @OneToOne(mappedBy = "address")
    private Customer customer;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String street;
    private int no;
    private String city;
    private String country;

    @Column(nullable = true)
    private String description;
}
