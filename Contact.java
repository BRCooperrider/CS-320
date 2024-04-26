// Bryce Cooperrider
package program;

public class Contact {
	
	// Declaration of variables
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	// Constructor
	public Contact(String id, String fName, String lName, String pNumber, String cAddress) {
		
		// Requirement checking for each field
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		
		if (fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		if (lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		if (pNumber == null || pNumber.length() > 10 || pNumber.length() < 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		if (cAddress == null || cAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		// Assign values in constructor
		this.contactId = id;
		this.firstName = fName;
		this.lastName = lName;
		this.phoneNumber = pNumber;
		this.address = cAddress;
	}
	
	// Getters
	public String getContactId() {
		return this.contactId;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	// Setters
	public void setContactId(String newId) {
		if (newId == null || newId.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		
		contactId = newId;
	}
	
	public void setFirstName(String newFirstName) {
		if (newFirstName == null || newFirstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		if (newLastName == null || newLastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		lastName = newLastName;
	}
	
	public void setPhoneNumber(String newPhoneNumber) {
		if (newPhoneNumber == null || newPhoneNumber.length() > 10 || newPhoneNumber.length() < 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		phoneNumber = newPhoneNumber;
	}
	
	public void setAddress(String newAddress) {
		if (newAddress == null || newAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		address = newAddress;
	}
}
