import java.util.Locale;
import java.util.Scanner;

public class Chocolate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String divisions = "";

        //Gets the quantity of numbers that will be read
        //aSize = scan.nextInt();
        scan.nextLine();
        divisions = scan.nextLine();

        //Creates the array with the given quantity
        String[] parts = divisions.split(" ");
        int[] array = new int[parts.length];

        //Gets the input for each the numbers
        for (int i = 0; i < parts.length; i++){
            array[i] = Integer.parseInt(parts[i]);
        }

        int rest = 0;

        for (int i = 0; i < parts.length; i++){
            rest += (array[i] - 1);
        }

        System.out.println(rest);
    }
}
