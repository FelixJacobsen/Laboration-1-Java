import java.util.Scanner;

public class MinMax {
     Scanner scanner = new Scanner(System.in);
     int[] minToMax = new int[5];
    public MinMax() {
        System.out.println("Enter five numbers, one at the time. When you have entered " +
                "five numbers, the highest and lowest number will be displayed in the console");
        userInput();
        printValues();
    }
    private void userInput() {
        for (int i = 0; i < minToMax.length; i++) {
            try {
                minToMax[i] = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ignore) {
                System.out.println("[ERROR]. You need to enter a whole number and then press enter ");
                i--;
            }
        }
    }
    private int sortingHighestValue() {
        int highestValue = Integer.MIN_VALUE;
        for (int i : minToMax) {
            if (i > highestValue)
                highestValue = i;
        }
        return highestValue;
    }
    private int sortingLowestValue() {
        int smallestValue = Integer.MAX_VALUE;
        for (int i : minToMax) {
            if (i < smallestValue)
                smallestValue = i;
        }
        return smallestValue;
    }
    private void printValues() {
        System.out.println("Min value: " + sortingLowestValue());
        System.out.println("Max value: " + sortingHighestValue());
    }
}
