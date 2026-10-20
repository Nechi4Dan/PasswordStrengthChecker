import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordChecker checker = new PasswordChecker();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (!checker.isValidPassword(password)) {
            System.out.println("Error: Password cannot be empty.");
        } else {
            int score = checker.calculateScore(password);
            String strength = checker.getStrength(score);

            System.out.println("Password score: " + score + "/5");
            System.out.println("Strength: " + strength);
        }

        scanner.close();
    }
}