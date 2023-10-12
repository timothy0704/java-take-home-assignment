import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("play Rock, Paper, Scissors");
        System.out.println("Pick what you want to choose for player 1");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        int p1 = input.nextInt();

        System.out.println("Pick what you want to choose for player 2");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        int p2 = input.nextInt();

        if (p1 == p2) {
            System.out.println("It's a tie!");
        } 
        else if (p1 == 1 && p2 == 3 || p1 == 2 && p2 == 1 || p1 == 3 && p2 == 2) {
            System.out.println("Player 1 wins!");
        } 
        else {
            System.out.println("Player 2 wins!");
        }
    }
}
