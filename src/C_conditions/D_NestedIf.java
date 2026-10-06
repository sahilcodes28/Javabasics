package C_conditions;

import java.util.Scanner;

public class D_NestedIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        boolean hasLicense = true;

        if (age >= 18) {

            if (hasLicense) {
                System.out.println("You can drive.");
            }
        }
        sc.close();
    }
}