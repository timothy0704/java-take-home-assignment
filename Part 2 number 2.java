import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        if (num1 <= num2 && num1 <= num3) {
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
