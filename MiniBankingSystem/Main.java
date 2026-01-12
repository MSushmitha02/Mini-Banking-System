import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        BankAccount account = new BankAccount(accNo, name);
        int choice = 0;
        do {
            System.out.println("\n--- Mini Banking System ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter numbers only.");
                sc.next();
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    try {
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid amount. Numbers only.");
                        sc.next();
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    try {
                        double withdrawAmount = sc.nextDouble();
                        account.withdraw(withdrawAmount);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid amount. Numbers only.");
                        sc.next();
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the Banking System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        sc.close();
    }
}
