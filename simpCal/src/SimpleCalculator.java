import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            // Get user input for numbers
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            // Get user input for operation
            System.out.println("\nChoose operation:");
            System.out.println("+ : Addition");
            System.out.println("- : Subtraction");
            System.out.println("* : Multiplication");
            System.out.println("/ : Division");
            System.out.print("Enter your choice (+, -, *, /): ");
            choice = scanner.next().charAt(0);

            // Perform calculation based on user choice
            double result;
            switch (choice) {
                case '+':
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero!");
                    } else {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            // Ask user to continue
            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}
