import java.util.Random;
import java.util.Scanner;

public class StenSaxPåse {
    public static void main(String[] args) {
        int userScore = 0;
        int computerScore = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            //A array with options to execute in Rock Papper Scissor
            String[] RockPapperScissor = {"rock", "paper", "scissor"};

            //The computers move with a randomized move based on the three options from the array ([0], [1] and [2] in the array)
            String computersMove = RockPapperScissor[new Random().nextInt(RockPapperScissor.length)];
            
            String playerMove;

            //A while-loop that only executes if the user enters wrong move
            while (true) {
                System.out.println("Enter your pick: (rock, paper or scissor)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("rock") || playerMove.equals("scissor") || playerMove.equals("paper")) {
                    break;
                }
                System.out.println(playerMove + "is not a valid move");
            }

            System.out.println("Computer played: " + computersMove);

            if (playerMove.equals(computersMove)) {
                System.out.println("It's a draw! ");

            } else if (playerMove.equals("rock")) {
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
            } else if (playerMove.equals("scissor")) {
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
            } else if (playerMove.equals("paper")) {
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


            if (computerScore >= 3 || userScore >= 3) {
                if (computerScore == 3) {
                    System.out.println("You lost!");
                } else if (userScore == 3) {
                    System.out.println("You won! ");
                }


                break;
            }


        }

    }
}
