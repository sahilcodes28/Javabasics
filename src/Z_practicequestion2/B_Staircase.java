package Z_practicequestion2;

import java.util.*;

public class B_Staircase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){

                // for space
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
               // for character
            for (int j = 1; j <= i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
    }
}