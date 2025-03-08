import java.util.Scanner;

public class InputHelper {

    public static double getDouble(Scanner pipe, String prompt) {
        double result = 0.0;
        boolean validInput = false;

        do {
            System.out.print(prompt); // Display the prompt
            if (pipe.hasNextDouble()) { // Check if the input is a valid double
                result = pipe.nextDouble(); // Read the double
                pipe.nextLine(); // Clear the input buffer (newline fix)
                validInput = true; // Valid input received
            } else {
                String trash = pipe.nextLine(); // Read and discard the invalid input
                System.out.println("Invalid input: \"" + trash + "\". Please enter a valid double.");
            }
        } while (!validInput);

        return result;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double userDouble = getDouble(console, "Enter a double value: ");
        System.out.println("You entered: " + userDouble);
    }
}
