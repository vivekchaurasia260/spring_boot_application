package com.payement.service.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
public class CardDetails {

    private String cardNumber;
    private String cardHolderName;
    private String cardExpiryDate;
    private String cardCVV;
}
