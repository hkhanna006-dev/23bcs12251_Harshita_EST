package atm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(10000); // initial balance

        System.out.println("===== ATM Withdrawal System =====");

        try {
            System.out.print("Enter amount to withdraw: ");

            double amount = sc.nextDouble(); // may throw InputMismatchException

            atm.withdraw(amount);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric amount.");
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the ATM!");
        }

        sc.close();
    }
}
