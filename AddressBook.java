import com.addressbook.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contact person = new Contact();
    public List<Contact> people = new ArrayList<>();

    public void addContact() {
        System.out.println("First Name :");
        person.setFirstName(sc.nextLine());

        System.out.println("Last Name :");
        person.setLastName(sc.nextLine());

        System.out.println("Address :");
        person.setAddress(sc.nextLine());

        System.out.println("City :");
        person.setCity(sc.nextLine());

        System.out.println("State :");
        person.setState(sc.nextLine());

        System.out.println("Zip :");
        person.setZip(sc.nextInt());

        System.out.println("Phone Number :");
        person.setPhoneNumber(sc.nextInt());

        sc.nextLine();
        System.out.println("Email :");
        person.setEmail(sc.nextLine());

        people.add(person);

    }

}
