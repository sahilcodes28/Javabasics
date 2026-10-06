package Z_practicequestion1;

import java.util.*;

public class R_HCFoftwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hcf = 1;
        int lowest = (a < b) ? a : b;

        for (int i = 1; i <= lowest; i++) {

            if (a % i == 0 && b % i == 0) {              // Is there a guarantee that this if condition will execute at least once?" NO
                hcf = i;
            }
        }
        System.out.println("HCF of two given numbers is: " + hcf);
        sc.close();
    }
}