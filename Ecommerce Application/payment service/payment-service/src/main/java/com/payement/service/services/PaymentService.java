package com.payement.service.services;

import com.payement.service.entities.Payment;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface PaymentService {
    Payment createPayment(Payment payment);
    Optional<Payment> getPaymentById(long paymentId);
    List<Payment> getPaymentsByOrderId(long orderId);
    List<Payment> getPaymentsByCustomerId(long customerId);
    Payment updatePaymentStatus(long paymentId, String status);
    boolean validatePayment(Payment payment);
    List<Payment> getPaymentByStatus(String status);
    List<Payment> getAllPayment();

    // Not in use;
    //List<Payment> getPaymentsByDateRange(LocalDateTime startDate, LocalDateTime endDate);

}
