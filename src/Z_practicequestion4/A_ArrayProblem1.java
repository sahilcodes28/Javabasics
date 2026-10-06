package Z_practicequestion4;

import java.util.*;

public class A_ArrayProblem1 {

    static int largestElement(int[] arr) {

        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[index] < arr[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       int result = A_ArrayProblem1.largestElement(arr);

        System.out.print(result);

        sc.close();
    }
}