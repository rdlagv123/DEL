package com.zoho.services;

import java.util.List;

import com.zoho.entities.Lead;

public interface LeadService {

public void saveLead(Lead lead);
public void saveOneLead(Lead lead);
public Lead getLeadById(long id);
public void deleteLeadById(long id);
public List<Lead> getAllLeads();
}
