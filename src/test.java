import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        //Skriver in talen
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }

        // Sorterar talen
        Arrays.sort(array);

        //Skriver ut talen
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Min value: " + array[0]);
        System.out.println("Second min value: " + array[1]);
        System.out.println("Max value: " + array[4]);
        System.out.println("Second max value: " + array[3]);

        int arrayValue = 0;

        for(int i = 0; i < array.length; i++)
            arrayValue = arrayValue + array[i];


        System.out.println("Value: " + arrayValue);






        //BACKUP CODE

        /*
    private void sortingHighestAndSecondHighestValue() {
        for (int i : userNumbers) {
            if (i > highestValue) {
                secondHighestValue = highestValue;
                highestValue = i;
            } else if (i != highestValue && i > secondHighestValue)
                secondHighestValue = i;
        }
    }
     private void sortingLowestAndSecondLowestValue() {
        for (int i : userNumbers) {
            if (i < smallestValue) {
                secondSmallestValue = smallestValue;
                smallestValue = i;
            } else if (i != smallestValue && i < secondSmallestValue)
                secondSmallestValue = i;
        }
    }
    //MIN MAX
    int largestValue = minToMax[0];
        int smallestValue = minToMax[0];
        for (int i = 0; i < minToMax.length; i++) {
            if (minToMax[i] < smallestValue) smallestValue = minToMax[i];
            if (minToMax[i] > largestValue) largestValue = minToMax[i];
        }
    */



    }
}
