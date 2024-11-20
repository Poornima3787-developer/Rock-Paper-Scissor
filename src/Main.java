import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            String[] rps = {"rock", "paper", "scissor"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove;
            while (true) {
                System.out.println("Enter your move:");
                playerMove = sc.nextLine().toLowerCase();
                if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissor")) {
                    break;
                }
                System.out.println(playerMove + " is not valid move!");
            }
            System.out.println("Computer move " + computerMove);
            if (playerMove.equals(computerMove)) {
                System.out.println("The game was tie!");
            } else if ((playerMove.equals("rock") && computerMove.equals("scissor")) ||
                    (playerMove.equals("paper") && computerMove.equals("rock")) ||
                      (playerMove.equals("scissor") && computerMove.equals("paper"))){
                System.out.println("Player wins!");
            }else {
                System.out.println("Computer wins!");
            }
            System.out.println("Play again ");
            String playAgain=sc.nextLine().toLowerCase();
            if(!playAgain.equals("yes")){
                break;
            }
        }
        sc.close();
    }
}