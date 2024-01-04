package bridgelab;

import java.util.List;

class AddressBook {
    private String bookName;
    private List<ContactPerson> contacts;

    public void addContact(ContactPerson person) {
        if (!contacts.contains(person)) {
            contacts.add(person);
            System.out.println("Contact added successfully!");
        } else {
            System.out.println("Duplicate entry! Contact not added.");
        }
    }

	public Object getContacts() {
		// TODO Auto-generated method stub
		return null;
	}

}
