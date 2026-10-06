package Z_practicequestion1;

import java.util.*;

public class S_CheckPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                        // 1 <= n <= 10^9

        boolean isPrime = true;                    // I will assume the number is prime -
        for (int i = 2; i*i <= n ; i++) {

            if (n % i == 0) {
                isPrime = false;                   // unless I find evidence that it is not.
                break;
            }
        }
            if (isPrime == true){
                System.out.println(n + " is a prime number");
            }
            else {
                System.out.println(n + " is not a prime number");
        }
        sc.close();
    }
}