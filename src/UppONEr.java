import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UppONEr {
    Scanner scanner = new Scanner(System.in);
    public UppONEr() {
        System.out.println("Enter a text and press enter ");
        System.out.println("Type \"end" + "\" When finished");
        storeNumbersUntilEnd();
    }

    private void storeNumbersUntilEnd() {
        String numbersWithAString;
        List<String> listNumbers = new ArrayList<>();
        do {
            numbersWithAString = scanner.nextLine();
            listNumbers.add(numbersWithAString);
        } while (!numbersWithAString.equalsIgnoreCase("END"));
        printList(listNumbers);
    }
    public void printList(List<String> listNumbers) {
        for (int i = 0; i < listNumbers.size() - 1; i++)
            System.out.println(listNumbers.get(i));

        for (int i = listNumbers.size() - 1; i >= 0; i--)
            System.out.println(listNumbers.get(i));
    }

}
