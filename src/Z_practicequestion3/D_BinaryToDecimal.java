package Z_practicequestion3;

import java.util.*;

public class D_BinaryToDecimal {

     static long binaryToDecimal(long n) {

         if (n <=0) return -1;

        long decimalNumber = 0;
         long power = 1;

        while ( n > 0) {

            long lastDigit = n % 10;
            if (lastDigit != 0 && lastDigit != 1)  return -1;

            decimalNumber += lastDigit * power;
            n /= 10;
            power *= 2 ;
        }
        return decimalNumber;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long binaryNumber = sc.nextInt();

        long result = D_BinaryToDecimal.binaryToDecimal(binaryNumber);

       if (result == -1) {
           System.out.println("Invalid binary number. Please inter a valid binary containing only 0 and 1");
       } else {
           System.out.println(result);
       }
       sc.close();
    }
}