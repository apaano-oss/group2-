import java.util.Scanner;

public class StudentScoreValidator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a student score: ");
            String input = scanner.nextLine().trim();

            try {
                int score = Integer.parseInt(input);

                if (score < 0 || score > 100) {
                    System.out.println("Score out of range");
                } else {
                    System.out.println("Valid score");
                }
            } catch (NumberFormatException e) {
                try {
                    Double.parseDouble(input);
                    System.out.println("Invalid whole-number input");
                } catch (NumberFormatException ex) {
                    System.out.println("Invalid numeric input");
                }
            }
        } finally {
            System.out.println("Score validation complete.");
        }
    }
}
