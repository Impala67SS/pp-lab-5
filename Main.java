import company.beans.Person;
import exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {

    public static void main(String[] args) {
        final int b = 10;

            try { Person[] people = new Person[5];
            for (int i = 0; i < people.length; i++) {
                people[i] = new Person("Kamil", 23);
            }    
            for (int i = 0; i < people.length; i++) {
                int age = people[i].getAge();
                int result = MathUtils.add(age, b);
                String message = "Dobry Den. Wiek" + people[i].getName() + " zwiększony o " + b + " wynosi: " + result;

                Messenger messenger = new EmailMessenger();
                messenger.sendMessage(message);
            }
         } catch (InvalidAgeException e) {
                System.out.println("Invalid age provided: " + e.getMessage());
        
            
    }
 }
}