import java.util.Random;
import java.util.Scanner;

public class StenSaxPåse {
    int userScore = 0;
    int computerScore = 0;
    Scanner scanner = new Scanner(System.in);
    public StenSaxPåse() {
        while (userScore < 3 && computerScore < 3) {
            String[] RockPapperScissor = {"rock", "paper", "scissor"};
            String playerMove = userMove();
            String computersMove = RockPapperScissor[new Random().nextInt(RockPapperScissor.length)];
            if (playerMove.equals(computersMove))
                System.out.println("It's a draw! ");
            System.out.println("Computer played: " + computersMove);
            switch (playerMove) {
                case "rock" -> rock(computersMove);
                case "paper" -> paper(computersMove);
                case "scissor" -> scissor(computersMove);
            }
        }
    }
    private String userMove() {
        String playerMove;
        while (true) {
            System.out.println("Enter your pick: (rock, paper or scissor)");
            playerMove = scanner.nextLine();
            if (playerMove.equals("rock") || playerMove.equals("scissor") || playerMove.equals("paper")) {
                break;
            }
            System.out.println(playerMove + " is not a valid move");
        }
        return playerMove;
    }
    public void rock(String computersMove) {
        if (computersMove.equals("paper")) {
            System.out.println("You lose");
            computerScore += 1;
            System.out.println("You score is: " + userScore);
            System.out.println("Computers score is: " + computerScore);
        } else if (computersMove.equals("scissor")) {
            System.out.println("You win");
            userScore += 1;
            System.out.println("You score is: " + userScore);
            System.out.println("Computers score is: " + computerScore);
        }
    }
    public void scissor(String computersMove) {
        if (computersMove.equals("paper")) {
            System.out.println("You win");
            userScore += 1;
            System.out.println("You score is: " + userScore);
            System.out.println("Computers score is: " + computerScore);
        } else if (computersMove.equals("rock")) {
            System.out.println("You lose");
            computerScore += 1;
            System.out.println("You score is: " + userScore);
            System.out.println("Computers score is: " + computerScore);
        }
    }
    public void paper(String computersMove) {
        if (computersMove.equals("scissor")) {
            System.out.println("You lose");
            computerScore +=1;
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
