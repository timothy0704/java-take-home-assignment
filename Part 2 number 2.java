import java.util.Scanner; //Initializing Scanner

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // delcaring Scanner

        System.out.print("Enter three numbers:"); // get the input from the user
        double num1 = input.nextDouble(); //delcaring num 1
        double num2 = input.nextDouble(); //delcaring num 2
        double num3 = input.nextDouble(); //delcaring num 3

        if (num1 <= num2 && num1 <= num3) { // if statement 
            System.out.println("The smallest number: " + num1);
        } 
          else if (num2 <= num1 && num2 <= num3) {
              System.out.println("The smallest number: " + num2);
          } 
            else {
                System.out.println("The smallest number: " + num3);
            }
         }
      }
