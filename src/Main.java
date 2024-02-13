// Gracie Hackworth, February 13th, 2024

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creates fake people
        Person person1 = new Person("Jessica");
        AddressBook addressBook1 = new AddressBook("Jessica@gmail.com");

        Person person2 = new Person("Killoran");
        AddressBook addressBook2 = new AddressBook("Killoran@ALC.com");

        Person person3 = new Person("John Mullaney");
        AddressBook addressBook3 = new AddressBook("JohnIsFunny@yahoo.com");


        // creates input so user can put in their own name & email
        Scanner input = new Scanner(System.in);

        //finds name
        System.out.println("What's the name of the person? ");
        String userName = input.nextLine();
        Person person4 = new Person(userName);

        //finds email
        System.out.println("What's the email address of " + userName + "?");
        String userEmail = input.nextLine();
        AddressBook addressBook4 = new AddressBook(userEmail);

        //links address book to person
        // potential way to reduce redundancies, for loop including num at the end of the object name and connecting
        // the two, then printing that way
        //too lazy to do right now :p
        addressBook1.display(person1);
        addressBook2.display(person2);
        addressBook3.display(person3);
        addressBook4.display(person4);
    }
}