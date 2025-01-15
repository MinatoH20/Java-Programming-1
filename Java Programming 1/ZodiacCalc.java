import java.util.Scanner;

public class ZodiacCalc {
    
    public static void main(String[]args ) {

        // creating an array of zodiac
        String[] zodiac =  {"rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep", "monkey", "rooster", "dog", "pig"};

        // create a mew scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year you were born: ");
        int year = scanner.nextInt();

        // Enter bease year
        int baseYear = 1900;
        int difference; 

        if (year > baseYear) {
            difference = year - baseYear;
        } else{
            difference = baseYear - year;
        }
        int zodiacIndex = difference % 12;
        // Print the Zodiac animal
        System.out.println("Your Zodiac sign " +year+ " is: " +zodiac[zodiacIndex]);

        scanner.close();
    }
}
