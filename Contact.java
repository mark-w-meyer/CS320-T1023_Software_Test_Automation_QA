package ContactPkg;

public class Contact {
   private final String  contactId;  // > 0 && < 11 chars, !null, !updatable
   
   private String  firstName;  // > 0 && < 11 chars, !null
   private String  lastName;   // > 0 && < 11 chars, !null
   private String  address;    // > 0 && < 31 chars, !null
   private String  phoneNum;   // > 0 && = 10 digits,!null
   
   // Contact object constructor, validates inputs
   public Contact(String contactId,
		   	      String firstName, 
		          String lastName, 
		          String address, 
		          String phoneNum) {
	   
	   // throw illegal argument exceptions for invalid inputs
	   if (contactId == null || contactId.length() <= 0 || contactId.length() > 10) {
		   throw new IllegalArgumentException("Invalid contact ID, must be a length of 1 to 10 characters.");
	   }
	   else {
		   this.contactId = contactId;
	   }
	   
	   if (firstName == null || firstName.length() <= 0 || firstName.length() > 10) {
		   throw new IllegalArgumentException("Invalid first name, must be a length of 1 to 10 characters.");
	   }
	   else {
		   this.firstName = firstName;
	   }
	   
	   if (lastName == null || lastName.length() <= 0 || lastName.length() > 10) {
		   throw new IllegalArgumentException("Invalid last name, must be a length of 1 to 10 characters.");
	   }
	   else {
		   this.lastName = lastName;
	   }
	   	   
	   if (address == null || address.length() <= 0 || address.length() > 30) {
		   throw new IllegalArgumentException("Invalid address, must be a length of 1 to 30 characters.");
	   }
	   else {
		   this.address = address;
	   }
	   
	   if (phoneNum == null || phoneNum.length() <= 0 || phoneNum.length() != 10) {
		   throw new IllegalArgumentException("Invalid phone number, must not be blank and must be exactly 10 characters.");
	   }
	   else {
		   this.phoneNum = phoneNum;
	   }

   }
  
   // ------------------Getters---------------------
   public String getContactId() {
	  return contactId;
   }

   public String getFirstName() {
	  return firstName;
   }

   public String getLastName() {
	  return lastName;
   }

   public String getAddress() {
	  return address;
   }

   public String getPhoneNum() {
	  return phoneNum;
   }
   
   // ------------------Setters---------------------- 
   public void setFirstName(String firstName) {
	  this.firstName = firstName;
   }

   public void setLastName(String lastName) {
	  this.lastName = lastName;
   }

   public void setAddress(String address) {
	  this.address = address;
   }

   public void setPhoneNum(String phoneNum) {
	  this.phoneNum = phoneNum;
   }
}


