package Q_11;
import java.util.Scanner;

public class NameStyle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = scan.nextLine().trim(); // Trim to remove leading/trailing spaces

        String[] name = fullName.split(" ");

        // Ensure at least a first and last name are entered
        if (name.length < 2) {
            System.out.println("Error: Please enter at least a first and last name.");
        } else {
            String formattedName = name[name.length - 1] + ", " + name[0];

            // Add middle initial if available
            if (name.length > 2) {
                formattedName += " " + name[1].charAt(0) + ".";
            }

            System.out.println(formattedName);
        }

        scan.close(); // Close scanner
    }
}
