import java.util.Random;
import java.util.Scanner;

public class StenSaxPåse {
    public static void main(String[] args) {
        int userScore = 0;
        int computerScore = 0;

        Scanner scanner = new Scanner(System.in);
        while (userScore < 3 && computerScore < 3) {
            String[] RockPapperScissor = {"rock", "paper", "scissor"};

            String computersMove = RockPapperScissor[new Random().nextInt(RockPapperScissor.length)];
            String playerMove;
            while (true) {
                System.out.println("Enter your pick: (rock, paper or scissor)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("rock") || playerMove.equals("scissor") || playerMove.equals("paper")) {
                    break;
                }
                System.out.println(playerMove + "is not a valid move");
            }

            if (playerMove.equals(computersMove))
                System.out.println("It's a draw! ");

            System.out.println("Computer played: " + computersMove);
            switch (playerMove) {
                case "rock" -> rock(computerScore, userScore, computersMove);
                case "paper" -> paper(computerScore, userScore, computersMove);
                case "scissor" -> scissor(computerScore, userScore, computersMove);
            }
        }
    }
    private static void rock(int computerScore, int userScore, String computersMove) {
        if (computersMove.equals("paper")) {
            System.out.println("You lose");
            computerScore++;
            System.out.println("You score is: " + userScore);
            System.out.println("Computers score is: " + computerScore);
        } else if (computersMove.equals("scissor")) {
            System.out.println("You win");
            userScore += 1;
            System.out.println("You score is: " + userScore);
            System.out.println("Computers score is: " + computerScore);
        }

    }
    private static void scissor(int computerScore, int userScore, String computersMove) {
        if (computersMove.equals("paper")) {
            System.out.println("You win");
            userScore += 1;
            System.out.println("You score is: " + userScore);
            System.out.println("Computers score is: " + computerScore);
        } else if (computersMove.equals("rock")) {
            System.out.println("You lose");
            computerScore++;
            System.out.println("You score is: " + userScore);
            System.out.println("Computers score is: " + computerScore);
        }

    }
    private static void paper(int computerScore, int userScore, String computersMove) {
        if (computersMove.equals("scissor")) {
            System.out.println("You lose");
            computerScore++;
            System.out.println("You score is: " + userScore);
            System.out.println("Computers score is: " + computerScore);
        } else if (computersMove.equals("rock")) {
            System.out.println("You win");
            userScore += 1;
            System.out.println("You score is: " + userScore);
            System.out.println("Computers score is: " + computerScore);
        }


    }
}
