package program;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	@Test
	//Test to see if contact is added to the vector
	void testAddContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("12345678", "Bryce", "Richard", "1234567890", "151 Sterling Drive");
		
		contactService.addContact(contact);
		
		assertTrue(!contactService.getContactList().isEmpty());
		assertTrue(contactService.getNumContacts() > 0);
		
	}
	
	@Test
	//Test to see if contact was removed
	void testRemoveContact() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("12345678", "Bryce", "Richard", "1234567890", "151 Sterling Drive");
		contactService.addContact(contact);
		
		contactService.removeContact("12345678");
		assertTrue(contactService.getNumContacts() == 0);
		
	}
	
	@Test
	//Test to see if we can update contacts
	void testUpdateContacts() {
		ContactService contactService = new ContactService();
		Contact contact = new Contact("12345678", "Bryce", "Richard", "1234567890", "151 Sterling Drive");
		contactService.addContact(contact);
		
		contactService.updateContact("12345678", "Joe", 1);
		assertTrue(contactService.getContactList().elementAt(1).getFirstName().equals("Joe"));
		
		contactService.updateContact("12345678", "Splotch", 2);
		assertTrue(contactService.getContactList().elementAt(2).getLastName().equals("Splotch"));
		
		contactService.updateContact("12345678", "2345678901", 3);
		assertTrue(contactService.getContactList().elementAt(3).getPhoneNumber().equals("2345678901"));
		
		contactService.updateContact("12345678", "705 Oak Street", 4);
		assertTrue(contactService.getContactList().elementAt(4).getAddress().equals("705 Oak Street"));
	}


}
