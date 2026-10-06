package D_loops;

import java.util.*;

public class C_DoWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        do {

            n = sc.nextInt();

        } while (n % 2 == 0);

        System.out.println("Your odd number is " + n);
    }
}
