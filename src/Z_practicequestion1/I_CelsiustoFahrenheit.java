package Z_practicequestion1;

import java.util.*;

public class I_CelsiustoFahrenheit {
    static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int tempInCelsius = sc.nextInt();               // Constraints (-1000 <= tempInCelsius <= 1000)

        int tempInFahrenheit =  (tempInCelsius * 9)/5 + 32;     //Given that value of C is a multiple of 5

        System.out.println(tempInFahrenheit);

        sc.close();
    }
}