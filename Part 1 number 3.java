import java.util.Scanner; //Scaner initializatiom 
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  //declare scanenr
    System.out.print("What is 32*91/2? ");
    double data1 = input.nextDouble();// takes input from the user
  
    if (data1 == 1456) { //if statement
    System.out.println("The answer is correct");
  }
    else{ 
      System.out.println("The answer is wrong");
    }

    System.out.print("What is (3/2)*(2/3)? ");
    double data2 = input.nextDouble();
    if (data2 == 1) {
    System.out.print("The answer is correct");
  }
    else{
      System.out.println("The answer is wrong");
    }
System.out.print("What is √4? ");
    double data3 = input.nextDouble();
    if (data3 == 2) {
    System.out.println("The answer is correct");
  }
    else{
      System.out.println("The answer is wrong");
    }

  }
}
