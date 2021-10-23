package ContactPkg;

import java.util.ArrayList;

public class ContactService {

	private ArrayList<Contact> contactList;
	
	// Default constructor
	public ContactService() {
		contactList = new ArrayList<>();
	}
	
	public boolean createContact(Contact contact) {
		boolean exists = false;
		for(Contact ct : contactList) {
			if (ct.equals(contact)) {
				exists = true;
			}
		}
		
		if (!exists) {
			// Add object to list if it does not already exist
			contactList.add(contact);
			return true;
		}
		else {
			return false;
		}
	
	}
	
	public boolean deleteContact(String id) {		
		// Look up contact using id to find index
		for (int k = 0; k < contactList.size(); k++) {
    		if (contactList.get(k).getContactId().equalsIgnoreCase(id) ) {
    			contactList.remove(k);
    			return true;
    		}
    	}
		return false;	
	}
	
	// If there were a user interface, the updating of contacts would be implemented
	// with a menu selection that would correspond with the index needed to edit the given element
	// i.e. (0 = contact ID, but is not updatable) 
	// 1 = firstName, 2 = lastName, 3 = address, 4 = phoneNum 
    public boolean updateContact(String id, int option, String element) {
    	boolean success = true;
    	for (int i = 0; i < contactList.size(); i++) {
    		if (contactList.get(i).getContactId().equalsIgnoreCase(id)) {
    			// Yet another check to disallow contact ID to be updated
    			if ( (option != 0) ) {
    				// Edit the object's specific element located using specified id
    				switch(option) {
	    				case 1:
	    					contactList.get(i).setFirstName(element);
	    					success = true;
	    					break;
	    				case 2:
	    					contactList.get(i).setLastName(element);
	    					success = true;
	    					break;
	    				case 3:
	    					contactList.get(i).setAddress(element);
	    					success = true;
	    					break;
	    				case 4:
	    					contactList.get(i).setPhoneNum(element);
	    					success = true;
	    					break;
	    				default:
	    					success = false;
	    					break;
    				}
    			}
    			else {
    				success = false;
    			}
    		}
    	}
    	return success;
	}
	
}
