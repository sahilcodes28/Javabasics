package Z_practicequestion2;

import java.util.*;

public class G_ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                                   //   1 <= N <= 10^6

        for (int i = 1; i <= n; i++) {
            long sumOfCubes = 0;
            int temp = i;

            while (temp != 0) {
                int lastDigit = temp % 10;
                sumOfCubes += (int) Math.pow(lastDigit, 3);                 // String.valueOf(i).length()
                temp /= 10;
            }
            if (sumOfCubes == i) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}