package F_array;

import java.util.*;

public class C_ArrayOperations {

    static void arrayOperation(int[] arr) {
        int sum = arr[0];
        int max = arr[0];
        int min = arr[0];

        for (int i = 1 ; i < arr.length; i++) {

            sum += arr[i];

            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        double avg = (double) sum / arr.length;

        System.out.print("sum : " + sum + " Avg : " + avg + " Max : " + max  + " Min : " + min);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        if (size <= 0) {                                                   // edge case
            System.out.print("Array size must be greater than 0.");
            return;
        }

        int [] arr = new int [size];
        for (int i = 0; i < arr.length; i++){

            arr [i] = sc.nextInt();
        }
        C_ArrayOperations.arrayOperation(arr);

        sc.close();
    }
}