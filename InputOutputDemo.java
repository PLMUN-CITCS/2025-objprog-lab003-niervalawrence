import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt for and read an integer
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();

        // Prompt for and read a decimal number (double)
        System.out.print("Enter a decimal number: ");
        double userDouble = input.nextDouble();

        // Consume the remaining newline character
        input.nextLine();

        // Prompt for and read a word or sentence
        System.out.print("Enter a word or sentence: ");
        String userString = input.nextLine();

        // Display the user input
        System.out.printf("Your integer: %d%n", userInt);
        System.out.printf("Your decimal number: %.2f%n", userDouble);
        System.out.printf("Your string: %s%n", userString);

        // Close the scanner to release resources
        input.close();
    }
}
