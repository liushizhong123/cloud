package com.lsz.springcloud.service;


import com.lsz.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

public interface PaymentService {
    int save(Payment payment);

    Payment getPaymentById(Long id);
}
