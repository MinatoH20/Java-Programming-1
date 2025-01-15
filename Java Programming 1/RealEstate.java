
import java.util.Scanner;

public class RealEstate {

    public static void main(String[] args) {
        //variables
        double commission = 0;
        double salesAmount = 0;

        //Asking the user for the commission rate

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your commission goal: $ ");
        double commmissionGoal = scanner.nextDouble();

        //Creating for loop to see if salesAmount is 0 then commission is increased by 1 until it reaches commissionGoal
        for (salesAmount = 0; commission < commmissionGoal; salesAmount++) {
            if (salesAmount >= 10000.01) {
                commission = 5000 * 0.08 + 5000 * 0.1 + (salesAmount - 10000) * 0.12;
            } else if (salesAmount >= 5000.01) {
                commission = 5000 * 0.08 + (salesAmount + 5000) * 0.10;
            } else {
                commission = (salesAmount +  10000)* 0.08;
            }
            break;
        }

        
        

        System.out.println("Commssion is: " + commission);
        
    }
}

