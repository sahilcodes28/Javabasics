package Z_practicequestion1;

import java.util.*;

public class O_LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
            System.out.println(1);                                        // Leap Year
        }
        else {
            System.out.println(0);                                      // Non Leap year
        }
        sc.close();
    }
}