package com.payement.service.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "payment")
@Getter
@Setter
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long paymentId;
    private long orderId;
    private long customerId;
    private double paymentAmount;
    private LocalDateTime paymentDate;
    private String paymentStatus;
    private String paymentMethod;
    private String transactionId;
    private String currency;

    @Embedded
    private CardDetails cardDetails;

    @Embedded
    private Address billingAddress;


}
