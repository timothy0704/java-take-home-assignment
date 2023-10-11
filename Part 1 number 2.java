import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int num1 = input.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = input.nextInt();

    if(num1 > num2) {
      System.out.println("The first number is greater than the second number");
    }
      else if(num1 < num2) {
      System.out.println("The second number is greater than the first number");
      }
      else{
      System.out.println("The numbers are euqal");
      }
    }
}
