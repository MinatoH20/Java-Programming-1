import java.util.Scanner;

public class Names {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // asking user for their first names
        System.out.println("Enter First Name: ");
        String firstName = input.nextLine();

        // asking the user for their last names
        System.out.println("Enter Last Name: ");
        String lastName = input.nextLine();

        // printing user first and last name
        System.out.println("My name is " + firstName + " " + lastName);
        

        
    }
}
