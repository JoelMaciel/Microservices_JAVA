package com.joel.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joel.hrpayroll.entities.Payment;
import com.joel.hrpayroll.entities.Worker;
import com.joel.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	

	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(long workerId, int days) {

		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
