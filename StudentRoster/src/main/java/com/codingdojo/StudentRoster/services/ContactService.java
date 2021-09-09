package com.codingdojo.StudentRoster.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.codingdojo.StudentRoster.models.Contact;
import com.codingdojo.StudentRoster.repositories.ContactRepository;

@Service
public class ContactService {
	private final ContactRepository contactRepository;
	public ContactService(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}
	
	//find all 
	public List<Contact> allContacts() {
		return contactRepository.findAll();
	}
	
	//create 
	public Contact createContact(Contact contact) {
		return contactRepository.save(contact);
	}
}
