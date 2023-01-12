package com.zoho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.entities.Contacts;

public interface ContactRepository extends JpaRepository<Contacts, Long> {

}
