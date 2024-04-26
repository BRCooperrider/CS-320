// Bryce Cooperrider

package program;

// I'm using vectors to store data
import java.util.Vector;

public class ContactService {
	
	// Create a vector to store the contacts
	private Vector<Contact> myContacts = new Vector<Contact>();
	
	//Create numContacts variable
	private int numContacts = 0;
	
	// Create a counter to count the number of contacts
	public int getNumContacts() {
		return numContacts;
	}
	
	// Getter for the list of contacts
	public Vector<Contact> getContactList() {
		return myContacts;
	}
	
	// Function to add contacts to the vector
	public void addContact(String id, String fName, String lName, String pNumber, String cAddress) {
		
		// Create new contact
		Contact newContact = new Contact(id, fName, lName, pNumber, cAddress);
		
		// Add the contact to the vector
		myContacts.add(newContact);
		
		numContacts++;
	}
	
	public void addContact(Contact contact) {
		
		myContacts.add(contact);
		
		numContacts++;
	}
	
	//Function to remove a contact from the vector
	public void removeContact(String id) {
		
		int index = -1;
		for (Contact c: myContacts) {
			if (c.getContactId() == id) {
				index = myContacts.indexOf(c);
			}
		}
		
		myContacts.remove(index);
		
		numContacts--;
	}
	
	public void removeContact(Contact contact) {
		
		myContacts.remove(contact);
		
		numContacts--;
	}
	
	// Function to update contacts
	void updateContact(String id, String update, int choice) {
		
		if (id == null || id.length() > 10 || choice < 0) {
			throw new IllegalArgumentException("Invalid contact id");
	}
		int index = -1;
		
		for (Contact c: myContacts) {
			if (c.getContactId() == id) {
				index = myContacts.indexOf(c);
			}
		}
		
		Contact updatedContact = myContacts.get(index);
		
		switch(choice) {
		case 1: {
			updatedContact.setFirstName(update);
		}
		
		case 2: {
			updatedContact.setLastName(update);
		}
		
		case 3: {
			updatedContact.setPhoneNumber(update);
		}
		
		case 4: {
			updatedContact.setAddress(update);
		}
		
		default: {
			removeContact(myContacts.elementAt(index));
			addContact(updatedContact);
		}
	}
	}
	
	public void updateContact(String id, String fName, String lName, String pNumber, String cAddress) {
		
		int index = -1;
		
		for (Contact c: myContacts) {
			if (c.getContactId() == id) {
				index = myContacts.indexOf(c);
			}
		}
		
		Contact tempContact = myContacts.get(index);
		
		tempContact.setFirstName(fName);
		tempContact.setLastName(lName);;
		tempContact.setPhoneNumber(pNumber);
		tempContact.setAddress(cAddress);
		
		myContacts.remove(index);
		myContacts.add(tempContact);
	}
}