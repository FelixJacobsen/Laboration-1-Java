
import java.util.Scanner;
public class Menu {
      public void welcomeToMenu(){
          System.out.println("""
                  +--------------------------+
                  |      Welcome to the      |
                  |      menu, please pick   |
                  |      your option by      |
                  |      entering a number   |
                  |__________________________|
                  """);
      }
      public void printMenu(){
          System.out.println("""
                         
                  [1] Upp och ner
                  [2] Min max
                  [3] Sten Sax Påse
                  [4] Ordning och reda
                  [E] Avsluta
                       """);
    }
    public void performAction(String userOption) {
        switch (userOption) {
            case "e" -> System.out.println("The program ends, thanks for playing! ");
            case "1" -> new UppONEr();
            case "2" -> new MinMax();
            case "3" -> new StenSaxPåse();
            case "4" -> new Test();
            default -> {
                System.out.print("You need to enter a number between 1-4 or \"E" + "\"! Try again");
                System.out.println(" ");
            }
        }
    }
    public static void main(String[] args) {
          Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        menu.welcomeToMenu();
        while(true){
            menu.printMenu();
            String choice = scanner.nextLine();
           menu.performAction(choice);
             if(choice.equalsIgnoreCase("e"))
             break;
        }
    }
}
