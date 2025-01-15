import java.util.Scanner;
import java.util.Random;
public class DiceGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String input = "";

        while (!input.equalsIgnoreCase("no")) {
            System.out.println("Would you like to roll the dice? (yes/no)");
            input = scan.nextLine();

            if (input.equalsIgnoreCase("yes")) {
                int randint = rand.nextInt(6) + 1;  
                System.out.println("You rolled: " + randint);
            } else if (!input.equalsIgnoreCase("no")) {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
        // Determine win conditions
       if (x==7 or x==11) {
        System.out.println("You win");
        
       }
        System.out.println("Thank you for playing!");
      
    }
}