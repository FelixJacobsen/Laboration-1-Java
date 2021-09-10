import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UppONer {
    public UppONer() {

    }

    public void run() {
        System.out.println("Enter a text and press enter ");
        System.out.println("Type \"end" + "\" When finished");
        storeNumbers();
        printArray();
    }

    String[] numbersWithAString = new String[10];
    int count = 0;

    private void storeNumbers() {
        String userInput;
        do {
            userInput = Menu.scanner.nextLine();
            add(userInput);
        } while (!userInput.equalsIgnoreCase("END"));
    }

    void add(String value) {
        if (count == numbersWithAString.length)
            grow();
        numbersWithAString[count] = value;
        count = count + 1;
    }

    //Skriver ut arrayen
    public void printArray() {
        for (int i = 0; i < count - 1; i++)
            System.out.println(numbersWithAString[i]);

        for (int i = count - 1; i >= 0; i--)
            System.out.println(numbersWithAString[i]);
    }

    public void grow() {
        String[] newArray = new String[numbersWithAString.length * 2];
        System.arraycopy(numbersWithAString, 0, newArray, 0, numbersWithAString.length);
        numbersWithAString = newArray;
    }

    String removeLast() {
        if (count == 0)
            return "0";
        return numbersWithAString[--count];
    }

    int length() {
        return count;
    }

    public String get(int i) {
        return numbersWithAString[i];
    }

    public String[] get() {
        return numbersWithAString;
    }
}

