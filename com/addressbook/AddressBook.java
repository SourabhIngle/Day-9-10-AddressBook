package com.addressbook;

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

        public void editContact() {

            System.out.println("Enter the contact whose details are to be edited: ");
            System.out.println("Enter First Name: ");
            String fname = sc.nextLine();
            System.out.println("Enter Last Name: ");
            String lname = sc.nextLine();

            int flag = 0;
            for (int j = 0; j < people.size(); j++) {
                Contact contact = people.get(j);
                if (contact.getFirstName().equals(fname) && contact.getLastName().equals(lname)) {
                    flag = 1;
                    System.out.println("First Name : " + contact.getFirstName());
                    System.out.println("Last Name  : " + contact.getLastName());
                    System.out.println("Address    : " + contact.getAddress());
                    System.out.println("City       : " + contact.getCity());
                    System.out.println("State      : " + contact.getState());
                    System.out.println("Zip        : " + contact.getZip());
                    System.out.println("Phone Number:" + contact.getPhoneNumber());
                    System.out.println("Email      : " + contact.getEmail());
                    System.out.println("---------------------------------------");
                    System.out.println("Enter the number which you want to edit\n1.First Name\n2.Last Name\n3.Address\n4.C\n5.State\n6.Zip\n7.Phone Number\n8.Email");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("First name:");
                            contact.setFirstName(sc.nextLine());
                            System.out.println("First name edited successfully");
                            break;
                        case 2:
                            System.out.println("Last name:");
                            contact.setLastName(sc.nextLine());
                            System.out.println("Last name edited successfully");
                            break;
                        case 3:
                            System.out.println("Address:");
                            contact.setAddress(sc.nextLine());
                            System.out.println("Address edited successfully");
                            break;

                        case 4:
                            System.out.println("City:");
                            contact.setCity(sc.nextLine());
                            System.out.println("City edited successfully");
                            break;
                        case 5:
                            System.out.println("State:");
                            contact.setState(sc.nextLine());
                            System.out.println("State edited successfully");
                            break;
                        case 6:
                            System.out.println("Zip:");
                            contact.setZip(sc.nextInt());
                            System.out.println("Zip edited successfully");
                            break;
                        case 7:
                            System.out.println("Phone number:");
                            contact.setPhoneNumber(sc.nextInt());
                            System.out.println("Phone Number edited successfully");
                            break;
                        case 8:
                            System.out.println("Email:");
                            contact.setEmail(sc.nextLine());
                            System.out.println("Email edited successfully");
                            break;
                    }
                }
            }
            if (flag == 0)
                System.out.println("Contact not found!!!");
        }

    public void deleteContact() {

        System.out.println("Enter the person whose contact to be deleted :");
        System.out.println("Enter First Name:");
        String fname = sc.nextLine();
        System.out.println("Enter Last Name:");
        String lname = sc.nextLine();

        for (int j = 0; j < people.size(); j++)
        {
            Contact person = people.get(j);
            if (person.getFirstName().equals(fname) && person.getLastName().equals(lname))
            {
                people.remove(person);
                System.out.println("person removed sucessfully");
            }
            else {
                System.out.println("contact not matched");
            }
        }

    }
}
