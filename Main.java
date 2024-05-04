import company.beans.Person;
import exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;

public class Main {
    public static void main(String[]args) {
        try {
            Person person = new Person("Kamil", 23);
            System.out.println("Name:"+ person.getName());
            System.out.println("Age: "+person.getAge());

            Messenger messenger = new EmailMessenger();
            messenger.sendMessage ("Dobry Den");

        } catch (InvalidAgeException e) { System.out.println("Invalid age provided"+ e.getMessage());
    
    }
    }
    
}
