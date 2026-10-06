package Z_practicequestion1;

import java.util.*;

public class N_NumberofDays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfMonth = sc.nextInt();

        if (numberOfMonth == 1 || numberOfMonth == 3 || numberOfMonth == 5 || numberOfMonth == 7
                || numberOfMonth == 8 || numberOfMonth == 10 || numberOfMonth == 12) {
            System.out.println("31");
        }
        else if (numberOfMonth == 4 || numberOfMonth == 6 || numberOfMonth == 9 || numberOfMonth == 11) {
            System.out.println("30");
        }
        else {
            System.out.println("28");                          // Consider as non-leap year
        }
        sc.close();
    }
}