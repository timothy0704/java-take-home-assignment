import java.util.Scanner; // initializing Scanner

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //declaring Scanner

        System.out.print("Please enter your age: "); // input from the user
        int age = input.nextInt(); // declaring the age

        if (age < 13) { //if statement
            System.out.println("You are a child.");
        } 
          else if (age >= 13 && age <= 19) {
              System.out.println("You are a teen.");
          } 
            else if (age >= 20 && age <= 65) {
                System.out.println("You are an adult.");
            } 
            else {
                System.out.println("You are a senior citizen.");
            }
          }
      }
