package Q_08;
import java.util.Scanner;

public class ExclamationMark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with exclamation marks:");
        String sentence = scanner.nextLine(); // Read full input

        // Split sentence by "!"
        String[] words = sentence.split("!");

        // Print each part of the sentence separately
        for (String word : words) {
            System.out.println(word.trim()); // Trim removes extra spaces
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
