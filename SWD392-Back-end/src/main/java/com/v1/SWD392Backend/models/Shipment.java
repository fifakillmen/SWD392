package com.v1.SWD392Backend.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "shipments")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shipmentId;
    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;
    private LocalDate shipmentDate;
    private String trackingNumber;
    @ManyToOne
    @JoinColumn(name = "shipping_carrier_id")
    private ShippingCarrier shippingCarrier;


}
