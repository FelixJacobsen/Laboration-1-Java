
import java.util.Scanner;
public class Menu {
      public static void welcomeToMenu(){
          System.out.println("""
                  +--------------------------+
                  |      Welcome to the      |
                  |      menu, please pick   |
                  |      your option by      |
                  |      entering a number   |
                  |__________________________|
                  """);
      }
      public static void printMenu(){
          System.out.println("""
                         
                  [1] Upp och ner
                  [2] Min max
                  [3] Sten Sax Påse
                  [4] Ordning och reda
                  [E] Avsluta
                       """);
    }
    public static void performAction(String userOption) {
        switch (userOption) {
            case "e":
                System.out.println("The program ends, thanks for playing! ");
                break;
            case "1":
                UppONEr uppgift1 = new UppONEr();
                break;
            case "2":
                MinMax.MinMax();
                break;
            case "3":
                StenSaxPåse uppgift3 = new StenSaxPåse();
                break;
            case "4":
                OrdningOchReda uppgift5 = new OrdningOchReda();
                break;
            default:
                System.out.print("You need to enter a number or \"E" + "\"! Try again");
                System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        welcomeToMenu();
        while(true){
            printMenu();
            String choice = scanner.nextLine();
             performAction(choice);
             if(choice.equalsIgnoreCase("e"))
             break;
        }
    }
}
