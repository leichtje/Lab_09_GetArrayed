import java.util.Random;
import java.util.Scanner;

public class ArrayStuffExtra {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }
        int minNumber = ArrayStuffExtra.min(dataPoints);
        System.out.println("The minimum number in the array is: " + minNumber);

        int maxNumber = ArrayStuffExtra.max(dataPoints);
        System.out.println("The maximum number in the array is: " + maxNumber);

        int target = ArrayStuff.getRangedInt(in,"What is the target number?",1,100);
        int occurrence = ArrayStuffExtra.occurrenceScan(dataPoints,target);
        System.out.println("The target number appears " + occurrence + " times.");

        int sum = ArrayStuffExtra.sum(dataPoints);
        System.out.println("The sum of the array is: " + sum);

        boolean contains = ArrayStuffExtra.contains(dataPoints,target);
        System.out.println("The target value appears in the array: " + contains);


        for (int i = 0; i < dataPoints.length; i++) {
            System.out.printf("%d | ", dataPoints[i]);
        }


        int average = 0;


        for (int i = 0; i < dataPoints.length; i++) {
            sum = sum + dataPoints[i];
        }
        average = sum / dataPoints.length;

        System.out.println("\nThe sum of the values in the array is: " + sum);
        System.out.println("The average of the values in the array is: " + average);

        int userNumber = ArrayStuff.getRangedInt(in, "What value are you looking for?", 0, 100);


        int occurrences = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userNumber) {
                occurrences = occurrences + 1;
            }
        }
        System.out.println("Your number appears " + occurrences + " times.");

        int userNumber2 = ArrayStuff.getRangedInt(in, "What other value are you looking for?", 0, 100);

        boolean found = false;
        int index=0;
        for(int i = 0;i< dataPoints.length;i++){

            if (dataPoints[i] == userNumber2) {
                found = true;
                index = i;
                break;
            }
        }            if (found){
            System.out.printf("%n%d exists at index %d",userNumber2,index);
        }   if (!found){
            System.out.println("The number you are looking for is not in the array");
        }

        maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] > maxNumber) {
                maxNumber = dataPoints[i];
            }
        }
        System.out.println();
        System.out.println("The maximum number in the loop is:" + maxNumber);


        minNumber = Integer.MAX_VALUE;

        for (int dataPoint : dataPoints) {
            if (dataPoint < minNumber) {
                minNumber = dataPoint;

            }
        }
        System.out.println("The minimum number in the loop is:" + minNumber);

    }

    public static int min(int values[]) {
        int minNumber = Integer.MAX_VALUE;
        int minNumberIndex = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] < minNumber) {
                minNumber = values[i];
            }
        }
        return minNumber;
    }
    public static int max(int values[]) {

        int maxNumber = Integer.MIN_VALUE;
        int maxNumberIndex = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] > maxNumber) {
                maxNumber = values[i];
            }
        }
        return maxNumber;
    }
    public static int occurrenceScan(int values[], int target) {
        int occurrences = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                occurrences = occurrences + 1;
            }
        }
        return occurrences;
    }

    public static int sum(int values[]) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        return sum;
    }

    public static boolean contains(int values[], int target) {

        boolean contains = false;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                contains = true;
            }
        }
        return contains;
    }
}
