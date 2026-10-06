package Z_practicequestion3;

import java.util.*;

public class C_PlaceValueChecker {

    public static boolean determineSecondDigit(int num) {

        // edge cases

        if (num < 10) return false;
        int secondDigit = (num /10) % 10;

        return (secondDigit == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean result = C_PlaceValueChecker.determineSecondDigit(num);

        if (result) {
            System.out.println("Yes");
        } else  {
            System.out.println("No");

        }
        sc.close();
    }
}