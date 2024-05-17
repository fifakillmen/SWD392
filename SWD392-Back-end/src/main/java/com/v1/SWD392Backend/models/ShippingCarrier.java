package com.v1.SWD392Backend.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Table(name = "shipping_carriers")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ShippingCarrier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shippingCarrierId;
    private String shippingCarrierName;
    private String description;

}