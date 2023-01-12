package com.zoho.services;

import java.util.List;

import com.zoho.entities.Contacts;

public interface ContactService {
public void SaveContact(Contacts contact);
public List<Contacts> getContacts();
public Contacts getContactById(long id);
}
