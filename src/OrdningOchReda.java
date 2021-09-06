import java.util.Arrays;
import java.util.Scanner;

public class OrdningOchReda {
    private final int[] userNumbers = new int[5];
    Scanner scanner = new Scanner(System.in);

    public OrdningOchReda() {
        System.out.println("Enter five numbers, after you have entered a number continue to the next by pressing spacebar. After you have entered five numbers press enter. ");
        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = Integer.parseInt(scanner.next());
        }
        printValues();
    }

    private int sumNumbers() {
        int sumNumbers = 0;
        for (int userNumber : userNumbers) sumNumbers = sumNumbers + userNumber;
        return sumNumbers;
    }

    private int sortingHighestValue() {
        int highestValue = Integer.MIN_VALUE;
        for (int i : userNumbers) {
            if (i > highestValue)
                highestValue = i;
        }
        return highestValue;
    }
    private int sortingLowestValue() {
        int smallestValue = Integer.MAX_VALUE;
        for (int i : userNumbers) {
            if (i < smallestValue)
                smallestValue = i;
        }
        return smallestValue;
    }
    private int sortingSecondHighestValue() {
        int highestValue = Integer.MIN_VALUE;
        int secondHighestValue = Integer.MIN_VALUE;
        for (int i : userNumbers) {
            if (i > highestValue) {
                secondHighestValue = highestValue;
                highestValue = i;
            } else if (i != highestValue && i > secondHighestValue)
                secondHighestValue = i;
        }
        return secondHighestValue;
    }

    private int sortingSecondLowestValue() {
        int smallestValue = Integer.MAX_VALUE;
        int secondSmallestValue = Integer.MAX_VALUE;
        for (int i : userNumbers) {
            if (i < smallestValue) {
                secondSmallestValue = smallestValue;
                smallestValue = i;
            } else if (i != smallestValue && i < secondSmallestValue)
                secondSmallestValue = i;
        }
        return secondSmallestValue;
    }

    private boolean numbersSorter2() {
        boolean sorter = true;
        for (int i = 0; i < userNumbers.length - 1; i++)
            if (userNumbers[i] > userNumbers[i + 1]) {
                sorter = false;
                break;
            }
        return sorter;
    }

    private void printValues() {
        System.out.println("Lowest value: " + sortingLowestValue());
        System.out.println("Second lowest value: " + sortingSecondLowestValue());
        System.out.println("Highest value: " + sortingHighestValue());
        System.out.println("Second highest value: " + sortingSecondHighestValue());
        System.out.println("Sum all numbers: " + sumNumbers());
        System.out.println("In order " + numbersSorter2());
    }
}

