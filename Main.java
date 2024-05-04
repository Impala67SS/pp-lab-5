import company.beans.Person;
import exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[]args) {
        try {
            Person person = new Person("Kamil", 23);
            System.out.println("Name:"+ person.getName());
            System.out.println("Age: "+person.getAge());

            int sum = MathUtils.add(12, 50);
            System.out.println("Sum: " + sum);
           
            Messenger messenger = new EmailMessenger();
            String message = "Dobry Den. Suma: " + sum;
            messenger.sendMessage(message);

        } catch (InvalidAgeException e) { System.out.println("Invalid age provided"+ e.getMessage());
    
    }
    }
    
}
