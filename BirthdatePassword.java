import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();

        String password = generatePassword(dob);
        System.out.println("Generated password: " + password);

        scanner.close();
    }

    public static String generatePassword(String dob) {
        String[] dateParts = dob.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        // A simple example of generating a password based on the date of birth
        String password = year + "@" + (month + day);

        return password;
    }
}
