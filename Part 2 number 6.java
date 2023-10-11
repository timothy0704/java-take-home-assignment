import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose your language preference:");
        System.out.println("e = English");
        System.out.println("f = French");
        System.out.println("g = German");
        System.out.println("k = Korean");
      System.out.println("s = Spanish");

        char languagePreference = input.next().charAt(0);

        if (languagePreference == 'e' || languagePreference == '1') {
            System.out.println("Hello! This greeting is in English.");
        } 
        else if (languagePreference == 'f' || languagePreference == '2') {
            System.out.println("Bonjour! This greeting is in French.");
        } 
        else if (languagePreference == 'g' || languagePreference == '3') {
            System.out.println("Hallo! This greeting is in German");
        } 
          else if (languagePreference == 'k' || languagePreference == '4') {
            System.out.println("안녕! This greeting is in Korean");
        } 
            else if (languagePreference == 's' || languagePreference == '5') {
            System.out.println("Hola! This greeting is in Spanish");
        } 
        else {
            System.out.println("I apologize, but I don't have a greeting in your language.");
        }
    }
}
