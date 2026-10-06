package Z_practicequestion1;

import java.util.*;

public class J_CelsiustoFahrenheit2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float tempInCelsius = sc.nextFloat();

        float tempInFahrenheit = (tempInCelsius * 9)/5 + 32;

        System.out.printf("%.6f",  tempInFahrenheit);

        sc.close();
    }
}
