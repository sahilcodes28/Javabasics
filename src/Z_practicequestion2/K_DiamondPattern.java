package Z_practicequestion2;

import java.util.*;

public class K_DiamondPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();

//            // Upper Half
//            for (int i = 1; i <= n; i = i + 2) {
//                for (int j = n - i; j >= 1; j--) {
//                    System.out.print(" ");
//                }
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//
//            // Lower Half
//            for (int i = n - 2; i >= 1; i = i - 2) {
//                for (int j = n - i; j >= 1; j--) {
//                    System.out.print(" ");
//                }
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//            t--;
//        }
//        sc.close();

            //  upper triangle
            int count = 1;
            for (int i = 1; i <= n / 2 + 1; i++) {
                for (int j = 1; j <= n - 2 * i + 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= count; j++) {
                    System.out.print("* ");
                }
                count += 2;
                System.out.println();
            }
            count -= 4;
            // lower half
            for (int i = 1; i <= n / 2; i++) {
                for (int j = 1; j <= 2 * i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= count; j++) {
                    System.out.print("* ");
                }
                System.out.println();
                count -= 2;
            }
            t--;
        }
        sc.close();
    }
}