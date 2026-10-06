package D_loops;

import java.util.Scanner;

public class D_NestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++) {

                System.out.println("i: " + i + " j: " + j);
            }
        }

        // 1111
        // 1111
        // 1111
        // 1111
        // 1111

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(1);
            }
            System.out.println();
        }

        // 1111
        // 2222
        // 3333
        // 4444
        // 5555

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // 12345
        // 12345
        // 12345
        // 12345

        System.out.println();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {

                System.out.print(j);
            }
            System.out.println();
        }

        // ****
        // ****
        // ****
        // ****

        System.out.println();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {

                System.out.print("*");

            }
            System.out.println();
        }

        // 1
        // 11
        // 111
        // 1111

        System.out.println();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(1);
            }
            System.out.println();
        }

        // 1
        // 12
        // 123
        // 1234
        // 12345

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // 1
        // 22
        // 333
        // 4444
        // 55555

        System.out.println();

        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        // 5
        // 54
        // 543
        // 5432
        // 54321

        System.out.println();

        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        //      1
        //     11
        //    111
        //   1111
        //  11111
        System.out.println();

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(1);
            }
            System.out.println();
        }

        System.out.println();

            // *****
            // *   *                    // hollow square
            // *   *
            // *   *
            // *****


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= n; j++){
                    if ( i == 1 || j == 1 || i == n || j == n ) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            System.out.println();

        // *
        // **                    // hollow right angle triangle
        // * *
        // *  *
        // *****

        int m = sc.nextInt();

        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= i; j++){
                if ( i == 1 || j == 1 || i == m || j == i ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();

        System.out.println();

        }
    }