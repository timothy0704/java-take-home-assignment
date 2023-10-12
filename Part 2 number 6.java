import java.util.Scanner; // initializing Scanner

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // declaring Scanner

        System.out.println("Choose your language preference:"); // Telling user what to do 
        System.out.println("e = English"); // option for English
        System.out.println("f = French"); // option for French
        System.out.println("g = German"); // option for German
        System.out.println("k = Korean"); // option for Korean
      System.out.println("s = Spanish"); // option for Spanish

        char language = input.next().charAt(0); // delcaring the language

        if (language == 'e' || language == '1') { // if statement for greeting English
            System.out.println("Hello! This greeting is in English.");
        } 
        else if (language == 'f' || language == '2') { // else if statement for greeting French
            System.out.println("Bonjour! This greeting is in French.");
        } 
        else if (language == 'g' || language == '3') { // else if statement for greeting German
            System.out.println("Hallo! This greeting is in German");
        } 
          else if (language == 'k' || language == '4') {  // else if statement for greeting Korean
            System.out.println("안녕! This greeting is in Korean");
        } 
            else if (language == 's' || language == '5') { //else if statement for greeting Spanish
            System.out.println("Hola! This greeting is in Spanish");
        } 
        else { // it the user input the other language, it will print "I apologize, but I don't have a greeting in your language."
            System.out.println("I apologize, but I don't have a greeting in your language.");
        }
    }
}
