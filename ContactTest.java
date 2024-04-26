package program;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {

	@Test
	//Tests to see if a null character throws an exception
	void testContactNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(null, null, null, null, null);
		});
	}
	
	
	@Test
	//Testing if contacts are being properly set
	void testContactGetters() {
		Contact contact = new Contact("12345678", "Bryce", "Richard", "1234567890", "151 Sterling Drive");
		assertTrue(contact.getContactId().equals("12345678"));
		assertTrue(contact.getFirstName().equals("Bryce"));
		assertTrue(contact.getLastName().equals("Richard"));
		assertTrue(contact.getPhoneNumber().equals("1234567890"));
		assertTrue(contact.getAddress().equals("151 Sterling Drive"));
	}
	
	@Test
	//Testing if contactId is set
	void testContactId() {
		Contact contact = new Contact("12345678", "Bryce", "Richard", "1234567890", "151 Sterling Drive");
		contact.setContactId("12345678");
		assertTrue(contact.getContactId().equals("12345678"));
	}
	
	@Test 
	//Testing if FirstName is set
	void testContactFirstName() {
		Contact contact = new Contact("12345678", "Bryce", "Richard", "1234567890", "151 Sterling Drive");
		contact.setFirstName("Bryce");
		assertTrue(contact.getFirstName().equals("Bryce"));
	}
	
	@Test
	//Testing if lastName is set
	void testContactLastName() {
		Contact contact = new Contact("12345678", "Bryce", "Richard", "1234567890", "151 Sterling Drive");
		contact.setLastName("Richard");
		assertTrue(contact.getLastName().equals("Richard"));
	}
	
	@Test
	//Testing if phone number is set
	void testContactPhoneNumber() {
		Contact contact = new Contact("12345678", "Bryce", "Richard", "1234567890", "151 Sterling Drive");
		contact.setPhoneNumber("1234567890");
		assertTrue(contact.getPhoneNumber().equals("1234567890"));
	}
	
	@Test
	//Testing iff address is set
	void testContactAddress() {
		Contact contact = new Contact("12345678", "Bryce", "Richard", "1234567890", "151 Sterling Drive");
		contact.setAddress("151 Sterling Drive");
		assertTrue(contact.getAddress().equals("151 Sterling Drive"));
	}
	
	@Test
	//Testing if null attributes throws an error
	void testSetNullAttributes() {
		Contact contact = new Contact("12345678", "Bryce", "Richard", "1234567890", "151 Sterling Drive");
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			contact.setFirstName(null);
		});
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			contact.setLastName(null);
		});
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			contact.setPhoneNumber(null);
		});
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			contact.setAddress(null);
		});
	}
	
	@Test
	//Test if fields can be too long, throw exception
	void testFieldsTooLong() {
		Contact contact = new Contact("12345678", "Bryce", "Richard", "1234567890", "151 Sterling Drive");
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			contact.setFirstName("JohnnyLongFirstName");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			contact.setLastName("JhonnyLongLastName");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			contact.setPhoneNumber("11223344556677889900");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			contact.setAddress("Street name that is likely way longer than 30 characters");
		});
	}

}
