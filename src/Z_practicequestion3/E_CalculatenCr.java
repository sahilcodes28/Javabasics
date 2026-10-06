package Z_practicequestion3;

import java.util.*;

public class E_CalculatenCr {

    public static long factorial(int n){
        long factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static long calculate_nCr(int n, int r){

        if (n < r || n < 0 || r < 0) return 0;


        return factorial(n) / (factorial(r) * factorial(n-r));
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                              // 1 <= n <= r <= 20
        int r = sc.nextInt();

        long result = E_CalculatenCr.calculate_nCr(n,r);

        System.out.println(result);
        sc.close();
    }
}