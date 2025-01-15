import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[10];

        // Initialize 10 accounts with id 0 to 9, each with a balance of $100
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100.0);
        }

        while (true) {
            System.out.print("Enter an account id (0-9) or -1 to exit: ");
            int id = scanner.nextInt();

            // Exit condition
            if (id == -1) {
                System.out.println("Exiting the ATM system. Goodbye!");
                break;
            }

            // Validate account id
            if (id < 0 || id >= accounts.length) {
                System.out.println("Invalid ID. Please try again.");
                continue;
            }

            // Display main menu for the valid id
            Account currentAccount = accounts[id];
            while (true) {
                System.out.println("\nMain menu:");
                System.out.println("1: Check Balance");
                System.out.println("2: Withdraw");
                System.out.println("3: Deposit");
                System.out.println("4: Exit");

                System.out.print("Enter a choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.printf("The balance is: $%.2f%n", currentAccount.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        currentAccount.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        currentAccount.deposit(depositAmount);
                        break;
                    case 4:
                        System.out.println("Exiting to the main screen.\n");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

                // Exit the current account session if choice is 4
                if (choice == 4) {
                    break;
                }
            }
        }
        scanner.close();
    }
}
