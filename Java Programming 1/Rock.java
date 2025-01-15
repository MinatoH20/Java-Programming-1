import java.util.Random;
import java.util.Scanner;

public class Rock {
    public static void main(String[] args) {
        // random number generator
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Game loop
        while (true) {
            // Ask for the player for their choice
            System.out.println("Enter your choice (Rock, Paper, Scissors). Type 'Exit' to quit: ");
            String userChoice = scanner.nextLine();

            // Check if the player wants to exit
            if (userChoice.equalsIgnoreCase("Exit")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }

            // Convert user input to a number: 0 = Rock, 1 = Paper, 2 = Scissors
            int userChoiceNum = -1;
            if (userChoice.equalsIgnoreCase("Rock")) {
                userChoiceNum = 0;
            } else if (userChoice.equalsIgnoreCase("Paper")) {
                userChoiceNum = 1;
            } else if (userChoice.equalsIgnoreCase("Scissors")) {
                userChoiceNum = 2;
            } else {
                System.out.println("Invalid input! Please try again.");
                continue; 
            }

            // Computer randomly chooses a number between 0 and 2
            int computerChoiceNum = random.nextInt(3); // Generates 0, 1, or 2
            String computerChoice = "";

            
            switch (computerChoiceNum) {
                case 0:
                    computerChoice = "Rock";
                    break;
                case 1:
                    computerChoice = "Paper";
                    break;
                case 2:
                    computerChoice = "Scissors";
                    break;
            }

            // Display computer's choice
            System.out.println("Computer chose: " + computerChoice);

            // Determine the winner using if-else conditions
            if (userChoiceNum == computerChoiceNum) {
                System.out.println("It's a tie!");
            } else if ((userChoiceNum == 0 && computerChoiceNum == 2) || // Rock beats Scissors
                       (userChoiceNum == 1 && computerChoiceNum == 0) || // Paper beats Rock
                       (userChoiceNum == 2 && computerChoiceNum == 1)) { // Scissors beat Paper
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            
            System.out.println();
        }

    
        scanner.close();
    }
}
        
    


