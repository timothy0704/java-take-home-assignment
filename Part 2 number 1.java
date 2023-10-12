import java.util.Scanner; //Scanner initialization 

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); declaring Scanner

    System.out.print("Enter the region that you're from: ");//letting the user type the output
    
    String data1 = input.nextLine(); //declaring 
    
    if (data1.equals("Toronto")) { //if statement
      System.out.println("CN Tower, Rogers Center, and Royal Ontario Museum are the places that you might want to visit in Toronto");
    } 
    else if (data1.equals("NorthYork")) {
      System.out.println("Ontario Science Centre, Toronto Botanical Garden, and Young Street are the places that you might want to visit in North York.");
    } 
    else if (data1.equals("Etobicoke")) {
      System.out.println("Centennial Park, Marie Curtis Park, and Centennial Park Conservatory are the places that you might want to visit in Etobicoke.");
    } 
    else if (data1.equals("Niagara")) {
      System.out.println("Niagara Falls, Niagara SkyWheel, and Skylon Tower are the places that you might want to visit in Niagara.");
    } 
    else {
      System.out.println("I don't know anything about the region");
    }
  }
}
