import java.util.Locale;
import java.util.Scanner;

public class Ordem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int aSize = 0;
        
        //Gets the quantity of numbers that will be read
        aSize = Integer.parseInt(scan.nextLine());
        
        int[] array = new int[aSize];

        for (int i = 0; i < aSize; i++) {
            array[i] = scan.nextInt();
        }
        scan.nextLine();

        int tests = 0;
        tests = Integer.parseInt(scan.nextLine());
        int[] testA = new int[2];
        boolean ordered = true;
        int current = 0;

        for (int i = 0; i < tests; i++){
            testA[0] = scan.nextInt();
            testA[1] = scan.nextInt();

            for(int j = testA[0]; j <= testA[1]; j++){
                if(array[j] < current)
                    ordered = false;
                
                current = array[j];
            }

            if(ordered)
                System.out.println("SIM");
            else
                System.out.println("NAO");

            ordered = true;
            current = 0;
        }
        
    }
}
