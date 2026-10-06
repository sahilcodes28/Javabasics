package Z_practicequestion1;

import java.util.*;

public class P_WhichAngledTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sideA = sc.nextInt();
        int sideB = sc.nextInt();
        int sideC = sc.nextInt();

        int largestSide = (sideA > sideB)
                ? ((sideA > sideC)? sideA : sideC )
                : ((sideB > sideC)?  sideB : sideC);


            if ( 2 *(largestSide * largestSide) < sideA * sideA + sideB * sideB + sideC * sideC ) {
                System.out.println("Acute Angled Triangle");
            }
            else if ( 2 *(largestSide * largestSide) > sideA * sideA + sideB * sideB + sideC * sideC ) {
                System.out.println("Obtuse Angled Triangle");
            }
            else {
                System.out.println("Right Angled Triangle");
            }
            sc.close();
    }
}