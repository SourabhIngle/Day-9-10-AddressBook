import com.addressbook.AddressBook;

public class AddressBookMain extends AddressBook {


    public static void main(String[] args) {
        AddressBookMain personInfo = new AddressBookMain();
        personInfo.addContact();
        System.out.println(personInfo.people);
    }
}
