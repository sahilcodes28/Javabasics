package Z_practicequestion3;

import java.util.*;

public class A_FunctionProblem3 {

    public int fun (int a) {

        for (int i = 1; i <= 5; i++) {

            a ++;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int positiveInteger = sc.nextInt();

        A_FunctionProblem3 obj = new A_FunctionProblem3();
        int result = obj.fun(positiveInteger);

        System.out.println(result);

        sc.close();
    }
}
