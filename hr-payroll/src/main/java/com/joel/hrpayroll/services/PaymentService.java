package com.joel.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.joel.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Joel", 200.0, days);
	}

}
