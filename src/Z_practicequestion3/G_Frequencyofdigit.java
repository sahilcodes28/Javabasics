package Z_practicequestion3;

import java.util.*;

public class G_Frequencyofdigit {

    static int frequencyOfDigit(int n, int digit) {

        if (n <= 0 && digit == 0) return -1;

        int frequency = 0;
        while (n > 0) {
            if (n % 10 == digit) {
                frequency++ ;
            }
            n /= 10;
        }
        return frequency;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = sc.nextInt();

        int result =  G_Frequencyofdigit.frequencyOfDigit(n,digit);

        System.out.println(result);
        sc.close();
    }
}