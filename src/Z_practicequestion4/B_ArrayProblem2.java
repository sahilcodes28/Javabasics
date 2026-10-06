package Z_practicequestion4;

import java.util.*;

public class B_ArrayProblem2 {

    static int findElement(int [] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 35) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = B_ArrayProblem2.findElement(arr);

        System.out.println(result);

    }
}