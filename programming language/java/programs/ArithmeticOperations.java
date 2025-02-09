/**
 * ArithmeticOperations
 */
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first number
        System.out.println("Enter the first number:");
        // Read the first number entered by the user
        double num1 = scanner.nextDouble();
        
        // Prompt the user to enter the second number
        System.out.println("Enter the second number:");
        // Read the second number entered by the user
        double num2 = scanner.nextDouble();
        
        // Prompt the user to choose an arithmetic operation
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        
        // Read the user's choice of operation
        int choice = scanner.nextInt();
        
        // Declare variables to store the result and the operation
        double result = 0;
        String operation = "";
        
        // Perform the chosen arithmetic operation
        switch(choice) {
            case 1:
                result = num1 + num2;
                operation = "Addition";
                break;
            case 2:
                result = num1 - num2;
                operation = "Subtraction";
                break;
            case 3:
                result = num1 * num2;
                operation = "Multiplication";
                break;
            case 4:
                // Check if the second number is not zero to avoid division by zero error
                if (num2 != 0) {
                    result = num1 / num2;
                    operation = "Division";
                } else {
                    // Display an error message if the second number is zero
                    System.out.println("Error! Division by zero.");
                    // Exit the program
                    return;
                }
                break;
            default:
                // Display an error message for an invalid choice
                System.out.println("Invalid choice!");
                // Exit the program
                return;
        }
        
        // Display the result of the arithmetic operation
        System.out.println(operation + " result: " + result);
        
        // Close the Scanner object to release resources
        scanner.close();
    }
}

