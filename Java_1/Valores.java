import java.util.Locale;
import java.util.Scanner;

public class Valores {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int aSize = 0;

        //Gets the quantity of numbers that will be read
        aSize = scan.nextInt();

        //Creates the array with the given quantity
        int[] array = new int[aSize];

        //Gets the input for each the numbers
        for (int i = 0; i < aSize; i++){
            array[i] = scan.nextInt();
        }

        //Sums all the even numbers
        int evenSum = 0;

        for (int i = 0; i < aSize; i++){
            if(array[i] % 2 == 0){
                evenSum += array[i];
            }
        }

        System.out.println(evenSum);

        //Gets the biggest number
        int biggestNumber = 0;

        for (int i = 0; i < aSize; i++){
            if(array[i] > biggestNumber)
                biggestNumber = array[i];
        }

        System.out.println(biggestNumber);

        //Computes the average
        double average = 0;

        for (int i = 0; i < aSize; i++) {
            average += array[i];
        }

        average = (average / aSize);

        System.out.println(String.format(Locale.GERMANY, "%.2f", average));

        //Computes the number of values bellow the average
        int bellowAverage = 0;

        for (int i = 0; i < aSize; i++) {
            if(array[i] < average)
                bellowAverage++;
        }

        System.out.println(bellowAverage);
    }
}
