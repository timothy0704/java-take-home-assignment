import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in); //declare scanner
    System.out.print("Enter the first number: "); //ask user a question
    int num1 = input.nextInt(); //
    System.out.print("Enter the second number: "); //ask user a question
    int num2 = input.nextInt();

    if(num1 > num2) { //if statement 
      System.out.println("The first number is greater than the second number");
    }
      else if(num1 < num2) { //else if statement
      System.out.println("The second number is greater than the first number");
      }
      else{ // if the input does not match if or else if, the out put will produce what is in else
      System.out.println("The numbers are euqal");
      }
    }
}
