import java.util.Scanner;

public class Invictos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int aSize = 0;

        //Gets the quantity of numbers that will be read
        aSize = scan.nextInt();
        scan.nextLine();

        int invict[] = new int[aSize];
        int start = 0;
        int end = 0;

        String[] result = new String[3];

        int ally = 0;
        int enemy = 0;

        int actual = 0;
        int actualInvict = 0;

        for (int i = 0; i < aSize; i++) {
            result = scan.nextLine().split("x");

            ally = Integer.parseInt(result[0]);
            enemy = Integer.parseInt(result[1]);

            if(ally >= enemy){
                if(invict[actual] == 0)
                    start = i + 1;

                invict[actual]++;
                
            }else{
                if(invict[actual] != 0)
                    end = i;
                actual++;   
            }
        }

        for (int  i : invict){
            if(i > actualInvict)
                actualInvict  = i;
        }

        System.out.println(actualInvict);
        System.out.println(start + " " + end);

    }
}
