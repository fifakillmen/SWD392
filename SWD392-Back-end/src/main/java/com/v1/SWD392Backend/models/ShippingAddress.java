package com.v1.SWD392Backend.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Table(name = "shipping_addresses")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ShippingAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shippingAddressId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipCode;


}