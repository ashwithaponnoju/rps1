import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Possible choices
        String[] choices = {"Rock", "Paper", "Scissors"};
        
        System.out.println("Enter your choice (Rock, Paper, Scissors): ");
        String userChoice = scanner.nextLine().trim();

        // Validate input
        if (!isValidChoice(userChoice)) {
            System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
            return;
        }

        // Computer's random choice
        String computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer chose: " + computerChoice);

        // Determine winner
        String result = determineWinner(userChoice, computerChoice);
        System.out.println(result);
    }

    public static boolean isValidChoice(String choice) {
        return choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("Paper") || choice.equalsIgnoreCase("Scissors");
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "It's a tie!";
        }

        switch (userChoice.toLowerCase()) {
            case "rock":
                return computerChoice.equalsIgnoreCase("Scissors") ? "You win!" : "Computer wins!";
            case "paper":
                return computerChoice.equalsIgnoreCase("Rock") ? "You win!" : "Computer wins!";
            case "scissors":
                return computerChoice.equalsIgnoreCase("Paper") ? "You win!" : "Computer wins!";
            default:
                return "Invalid input.";
        }
    }
}

