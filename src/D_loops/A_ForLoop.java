package D_loops;

import java.util.*;

public class A_ForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            System.out.println("hello");
        }
        sc.close();

//        for ( ; ; )
//        { System.out.println("hello"); }               // infinite loop
//
//         int i = 1;
//        for( ; i <= n;  ){                       you can initialize or update outside of brackets
//            System.out.println(i);
//            i++;
//        }
    }
}
