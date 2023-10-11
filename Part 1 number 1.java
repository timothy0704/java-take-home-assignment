import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first name: ");
    String data1 = input.nextLine();
    System.out.print("Enter the second name: ");
    String data2 = input.nextLine();

    

    if(data1.equals (data2)){
      System.out.println("they are the same");
    }
    else{
      System.out.println("they are different");
    }
    input.close();
  }
}
