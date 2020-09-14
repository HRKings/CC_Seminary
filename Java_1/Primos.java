import java.util.Locale;
import java.util.Scanner;

public class Primos {

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

        for (int i = 0; i < aSize; i++){
            isPrime(array[i]);
        }
    }

    static void isPrime(int num){
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("SIM");
        else
            System.out.println("NAO");
    }
}
