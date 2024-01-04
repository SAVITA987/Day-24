package bridgelab;
import java.util.Scanner;
public class AddressBookMain {

	        Scanner scanner = new Scanner(System.in);

	        public static void main(String[] args) {
	            
	            AddressBook book1 = new AddressBook();
	            ContactPerson person1 = new ContactPerson();
	            ContactPerson person2 = new ContactPerson();

	            book1.addContact(person1);
	            book1.addContact(person2);

	            System.out.println("Address Book Contents:");
	            book1.getContacts().forEach(System.out::println);
	        }
	    }
