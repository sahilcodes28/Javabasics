package Z_practicequestion2;

import java.util.*;

public class H_PrintFibonacciNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0 ;
        int b = 1;

        for (int i = 1; i < n-1; i++) {

            System.out.println(a);          // After updating a, a itself becomes the next number I need to print.

            int next = a +b;
            a = b;
            b = next;
        }
        sc.close();
    }
}