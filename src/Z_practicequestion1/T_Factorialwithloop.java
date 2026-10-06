package Z_practicequestion1;

import java.util.*;

public class T_Factorialwithloop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                     // 0 <= n <= 20

        long factorial = 1;                       // overflow after 12 if we use int
        for (int i = n; i > 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
