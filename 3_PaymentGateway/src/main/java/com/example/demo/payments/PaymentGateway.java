package com.example.demo.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
