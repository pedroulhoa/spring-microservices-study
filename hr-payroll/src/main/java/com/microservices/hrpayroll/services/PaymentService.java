package com.microservices.hrpayroll.services;

import com.microservices.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob", 1000.0, days);
    }

}
