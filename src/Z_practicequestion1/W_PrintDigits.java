package Z_practicequestion1;

import java.util.*;

public class W_PrintDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int div = 1;

        while( temp >= 10){
            div *= 10;
            temp /= 10;
        }

        while (div > 0){                                    // not used n > 0 ?? dont get exact output if the number have trailing zero.
            int mostSignificantDigit = n / div;
            System.out.println(mostSignificantDigit);

            n %= div;
            div /= 10;
        }
        sc.close();
    }
}
