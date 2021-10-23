package ContactTestPkg;

import ContactPkg.Contact;
import ContactPkg.ContactService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddContactSuccess() {
		ContactService cService = new ContactService();
		Contact one   = new Contact("C1", "Mark", "Doe", "123 Java Street", "1234567891");
		Contact two   = new Contact("C2", "Matt", "Gon", "345 C Road", "1234512345");
		Contact three = new Contact("C3", "Nick", "Hut", "456 Python Avenue", "1987654321");
		assertEquals(true, cService.createContact(one));
		assertEquals(true, cService.createContact(two));
		assertEquals(true, cService.createContact(three));
	}
	
	@Test
	void testAddContactFail() {
		ContactService cService = new ContactService();
		Contact one   = new Contact("C1", "Mark", "Doe", "123 Java Street", "1234567891");
		Contact two   = new Contact("C2", "Matt", "Gon", "345 C Road", "1234512345");
		Contact three = new Contact("C3", "Nick", "Hut", "456 Python Avenue", "1987654321");
		assertEquals(true, cService.createContact(one));
		assertEquals(false, cService.createContact(one));
		assertEquals(true, cService.createContact(two));
		assertEquals(true, cService.createContact(three));
	}
	
	@Test
	void testDeleteContactSuccess() {
		ContactService cService = new ContactService();
		Contact one   = new Contact("C1", "Mark", "Doe", "123 Java Street", "1234567891");
		Contact two   = new Contact("C2", "Matt", "Gon", "345 C Road", "1234512345");
		Contact three = new Contact("C3", "Nick", "Hut", "456 Python Avenue", "1987654321");
		assertEquals(true, cService.createContact(one));
		assertEquals(true, cService.createContact(two));
		assertEquals(true, cService.createContact(three));
		
		assertEquals(true, cService.deleteContact("C1"));
		assertEquals(true, cService.deleteContact("C2"));
	}
	
	@Test
	void testDeleteContactFail() {
		ContactService cService = new ContactService();
		Contact one   = new Contact("C1", "Mark", "Doe", "123 Java Street", "1234567891");
		Contact two   = new Contact("C2", "Matt", "Gon", "345 C Road", "1234512345");
		Contact three = new Contact("C3", "Nick", "Hut", "456 Python Avenue", "1987654321");
		assertEquals(true, cService.createContact(one));
		assertEquals(true, cService.createContact(two));
		assertEquals(true, cService.createContact(three));
		
		assertEquals(false, cService.deleteContact("C5"));
		assertEquals(true, cService.deleteContact("C2"));
	}
	
	// Ensure contact Id is not updatable
	@Test
	void testUpdateContactIdFail() {
		ContactService cService = new ContactService();
		Contact one   = new Contact("C1", "Mark", "Doe", "123 Java Street", "1234567891");
		Contact two   = new Contact("C2", "Matt", "Gon", "345 C Road", "1234512345");
		Contact three = new Contact("C3", "Nick", "Hut", "456 Python Avenue", "1987654321");
		assertEquals(true, cService.createContact(one));
		assertEquals(true, cService.createContact(two));
		assertEquals(true, cService.createContact(three));
		
		assertEquals(true, cService.updateContact("C2", 3, "789 Objective C Boulevard"));
		assertEquals(false, cService.updateContact("C3", 0, "C4"));
		assertEquals(true, cService.updateContact("C3", 4, "1234567777"));
	}
	
	@Test
	void testUpdateContactSuccess() {
		ContactService cService = new ContactService();
		Contact one   = new Contact("C1", "Mark", "Doe", "123 Java Street", "1234567891");
		Contact two   = new Contact("C2", "Matt", "Gon", "345 C Road", "1234512345");
		Contact three = new Contact("C3", "Nick", "Hut", "456 Python Avenue", "1987654321");
		assertEquals(true, cService.createContact(one));
		assertEquals(true, cService.createContact(two));
		assertEquals(true, cService.createContact(three));
		
		assertEquals(true, cService.updateContact("C1", 1, "Firstname"));
		assertEquals(true, cService.updateContact("C3", 2, "Lastname"));
		assertEquals(true, cService.updateContact("C2", 3, "AddressCorrection"));
		assertEquals(true, cService.updateContact("C2", 4, "1234567777"));
	}
	
	@Test
	void testUpdateContactFail() {
		ContactService cService = new ContactService();
		Contact one   = new Contact("C1", "Mark", "Doe", "123 Java Street", "1234567891");
		Contact two   = new Contact("C2", "Matt", "Gon", "345 C Road", "1234512345");
		Contact three = new Contact("C3", "Nick", "Hut", "456 Python Avenue", "1987654321");
		assertEquals(true, cService.createContact(one));
		assertEquals(true, cService.createContact(two));
		assertEquals(true, cService.createContact(three));
		
		assertEquals(false, cService.updateContact("C1", 5, "Marc"));
		assertEquals(true, cService.updateContact("C2", 3, "789 Objective C Boulevard"));
		assertEquals(false, cService.updateContact("C3", 0, "AddressCorrection"));
		assertEquals(true, cService.updateContact("C3", 4, "1234567777"));
	}

}
