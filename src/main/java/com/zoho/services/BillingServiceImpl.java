package com.zoho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entities.Billing;
import com.zoho.repository.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
@Autowired 
private BillingRepository billRepo;
	@Override
	public void generateBill(Billing bill) {
		billRepo.save(bill);

	}
	@Override
	public Billing getBill(long id) {
		 Optional<Billing> findById = billRepo.findById(id);
		 Billing bill = findById.get();
		return bill;
	}

}
