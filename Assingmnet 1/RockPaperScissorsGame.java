import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playerWins = 0;
        int computerWins = 0;
        String playAgain;

        do{
            System.out.println("Chose your move: Rock, Paper, Scissors");
            String playerMove = scanner.nextLine() .toLowerCase();

        
            int randomNumber = random.nextInt(3);
            String computerMove;
            if (randomNumber==0){
                computerMove = "rock";
            } else if (randomNumber==1){
                computerMove = "paper";
            } else {
                computerMove = "scissors";
            }
            System.out.println("Computer chose " + computerMove);


            if(playerMove.equals(computerMove)){
                System.out.println("It's a draw");
            } else if (playerWins(playerMove, computerMove)){
                System.out.println("Player Wins");
                playerWins++;
            } else {
                System.out.println("Computer Wins");
                computerWins++;
            }


            System.out.println("Do you want to play again? (y/n): ");
            playAgain = scanner.nextLine().toLowerCase();

            
        }    

        while (playAgain.equals("y"));
            System.out.println("Game Over");
            System.out.println("Your Wins: " + playerWins);
            System.out.println("Computer Wins: " + computerWins);

            scanner.close();
    }

    static boolean playerWins (String playerMove, String computerMove){
        if (playerMove.equals("rock")){
            return computerMove.equals("scissors");
        } else if (playerMove.equals("paper")){
            return computerMove.equals("rock");
        } else {
            return computerMove.equals("paper");
        }
    } 
}