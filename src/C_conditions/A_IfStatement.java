package C_conditions;

import java.util.Scanner;

public class A_IfStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible for vote");
        }
        sc.close();
    }
}
