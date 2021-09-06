import java.util.Scanner;

public class MinMax {
    static Scanner scanner = new Scanner(System.in);
    static int[] minToMax = new int[5];
    public static void MinMax() {

        System.out.println("Enter five numbers, one at the time. When you have entered " +
                "five numbers, the highest and lowest number will be displayed in the console");

        //OPS@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        //Loops forever
        for (int i = 0; i < minToMax.length; i++) {
            try{
                minToMax[i] = scanner.nextInt();
            }
            catch (Exception e){
                System.out.println("It has to be a integer number! Try again: ");
                i--;
            }
        }
        arraySorter();
    }
    private static void arraySorter() {

        System.out.println("Min value: " + lowestValueInArray());
        System.out.println("Max value: " + highestValueInArray());
    }

    //Funkar inte med minus tal
    private static int highestValueInArray (){
        int highestValue = Integer.MIN_VALUE;
        for(int i = 0; i < minToMax.length; i++){
            if(i > highestValue){
                highestValue = minToMax[i];
            }
        }
        return highestValue;
    }
    private static int lowestValueInArray(){
        int lowestValue = Integer.MAX_VALUE;
        for(int i = 0; i< minToMax.length; i++){
            if(i < lowestValue)
                lowestValue = minToMax[i];
        }
        return lowestValue;
    }
}
