package Z_practicequestion3;

import java.util.*;

public class F_CalculatenPr {

    static long factorial(int x){

        long fact = 1;
        for (int i = 1; i <= x; i++){
            fact *= i;
        }
        return fact;
    }

    static long calculatenPr(int n, int r) {

        if (n < r || n < 0 || r < 0)  return 0;

        return  (factorial(n) / factorial(n-r));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        long result = F_CalculatenPr.calculatenPr(n,r);
        System.out.println(result);
        sc.close();
    }
}