package ContactTestPkg;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ContactPkg.Contact;

class ContactTest {
	
    // Contact object---------------------------
	@Test
	void testContact() {
		Contact contact = new Contact("C1", "Mark", "Meyer", "123 Java Road", "1234567891");
		assertTrue(contact.getContactId().equals("C1"));
		assertTrue(contact.getFirstName().equals("Mark"));
		assertTrue(contact.getLastName().equals("Meyer"));
		assertTrue(contact.getAddress().equals("123 Java Road"));
		assertTrue(contact.getPhoneNum().equals("1234567891"));
	}
	
	// Contact Id----------------------------
	@Test
	void testContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Mark", "Meyer", "123 Java Road", "1234567891");
		});
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789 1", "Mark", "Meyer", "123 Java Road", "1234567891");
		});
	}
	
	// First Name ----------------------------
	@Test
	void testFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", null, "Meyer", "123 Java Road", "1234567891");
		});
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "123456789 1", "Meyer", "123 Java Road", "1234567891");
		});
	}
	
	// Last Name----------------------------
	@Test
	void testLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Mark", null, "123 Java Road", "1234567891");
		});
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Mark", "123456789 1", "123 Java Road", "1234567891");
		});
	}
	
	// Address----------------------------
	@Test
	void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Mark", "Meyer", null, "1234567891");
		});
	}
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Mark", "Meyer", "123456789 123456789 123456789 1", "1234567891");
		});
	}
	
	// Phone Number----------------------------
	@Test
	void testPhoneNumIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Mark", "Meyer", "123 Java Road", null);
		});
	}
	
	@Test
	void testPhoneNumTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Mark", "Meyer", "123 Java Road", "123456789 1");
		});
	}
	
	@Test
	void testPhoneNumTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "Mark", "Meyer", "123 Java Road", "123456789");
		});
	}
}
