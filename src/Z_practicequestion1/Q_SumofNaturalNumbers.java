package Z_practicequestion1;

import java.util.*;

public class Q_SumofNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sumOfNaturalNumber = 0;

        for (int i = 1; i <= n; i++) {                     // You can also use formula n*(n+1)/2
            sumOfNaturalNumber += i;
        }
        System.out.println(sumOfNaturalNumber);

        sc.close();
    }
}
