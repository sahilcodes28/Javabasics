package Z_practicequestion1;

import java.util.* ;

public class K_ConditionalProblem6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("we are odd");
        } else {
            System.out.println("we are simple");
        }
        sc.close();
    }
}