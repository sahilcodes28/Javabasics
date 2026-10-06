package Z_practicequestion2;

import java.util.*;

public class E_PrintNumberPattern2 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {      // or (int j = 1; j <= i; j++) { System.out.print(i - j + 1);

                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();

    }
}