package com.zoho.services;

import java.util.List;

import com.zoho.entities.Billing;

public interface BillingService {
 public void generateBill(Billing bill);
 public Billing getBill(long id);
}
