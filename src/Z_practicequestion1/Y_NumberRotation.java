package Z_practicequestion1;

import java.util.*;

public class Y_NumberRotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int digit = 1;
        int count = 1;
        int temp = n;

        while (temp >= 10) {
            digit *= 10;
            count++;
            temp /= 10;
        }
//        if (k < 0) {
//            for (int i = 1; i <= (-k) % count; i++) {
//                int remainder = n % digit;
//                int leftMostDigit = n / digit;
//                n = remainder * 10 + leftMostDigit;
//            }
//        }
//        else {
//            for (int i = 1; i <= k % count; i++) {
//                int rightMostDigit = n % 10;
//                n = n / 10;
//                n = rightMostDigit * digit + n;
//
//            }
//        }
//        System.out.println(n);
//        sc.close();

        k = k % count;

        if (k < 0 ) {
            k = (k + count) ;
        }
        for ( int i = 1 ; i <=  k; i++ ) {
            int rightMostDigit = n % 10;
            n = n / 10;
            n = rightMostDigit * digit + n;
        }
        System.out.println(n);
        sc.close();
    }
}