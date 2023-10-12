import java.util.Scanner; //initialization for Scanner
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //declaring Scanner

        System.out.println("play Rock, Paper, Scissors"); 
        System.out.println("Pick what you want to choose for player 1");// user input the value
        System.out.println("1. Rock"); //option 1 for player 1
        System.out.println("2. Paper");//option 2 for player 1
        System.out.println("3. Scissors");//option 3 for player 1
        int p1 = input.nextInt(); // declaring player 1

        System.out.println("Pick what you want to choose for player 2");
        System.out.println("1. Rock");//option 1 for player 2
        System.out.println("2. Paper");//option 2 for player 2
        System.out.println("3. Scissors");//option 3 for player 2
        int p2 = input.nextInt(); // declaring player 2

        if (p1 == p2) { //if statement if the p1 is equal to p2
            System.out.println("It's a tie!"); // if it is the result is tie
        } 
        else if (p1 == 1 && p2 == 3 || p1 == 2 && p2 == 1 || p1 == 3 && p2 == 2) {  // papper win against rock, rock wins against scissors, and scissors wins against papper
            System.out.println("Player 1 wins!"); 
        } 
        else { 
            System.out.println("Player 2 wins!");
        }
    }
}
