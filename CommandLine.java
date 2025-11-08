import java.util.Scanner;

public class CommandLine {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an operation (+, -, *, /) followed by numbers:");

    String numinput = scanner.nextLine();  

    if (args.length == 0) {
        System.out.println("No arguments provided.");
    } else {
        // Check if we have enough arguments (need at least 3: operator and 2 operands)
        if (args.length < 3) {
            System.out.println("Not enough arguments. Usage: operator number1 number2... number N");
            return;
        }

        // first arg marks the operation
        String operator = args[0];
        double result = Double.parseDouble(args[1]); // Initialize with first number

        try {
            for (int i = 2; i < args.length; i++) {
                double number = Double.parseDouble(args[i]);
                switch (operator) {
                    case "+":
                        result += number;
                        break;
                    case "-":
                        result -= number;
                        break;
                    case "*":
                        result *= number;
                        break;
                    case "/":
                        if (number == 0) {
                            System.out.println("Error: Division by zero");
                            return;
                        }
                        result /= number;
                        break;
                    default:
                        System.out.println("Unknown operator: " + operator + ". Please enter one of +, -, *, /");
                        return;
                }
            }
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        }
    }
}
}