import java.util.Scanner; // initializing Scanner

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // declaring Scanner

        System.out.print("Enter three numbers:"); // get the input from the user
        double num1 = input.nextDouble(); // declaring num1
        double num2 = input.nextDouble(); // declaring num2
        double num3 = input.nextDouble(); // declaring num3

        if (num1 >= num2 && num1 >= num3) { //if statement
            System.out.println("The greatest number is: " + num1);
        } 
          else if (num2 >= num1 && num2 >= num3) { 
              System.out.println("The greatest number is: " + num2);
          } 
            else {
                System.out.println("The greatest number is: " + num3);
            }
        }
    }
  
