package Z_practicequestion2;

import java.util.*;

public class A_OptimusPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {

        boolean isPrime = true;
        for (int j = 2 ; j*j < i ; j++){

            if ( i % j == 0 ){
                isPrime = false;
                break;
            }
        }
        if (isPrime == true){
            System.out.println(i);
        }
    }
        sc.close();
}
}