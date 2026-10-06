package Z_practicequestion4;

import java.util.*;

public class H_MaximumDifferenceBetweentwoElements {

    static int maxDifferenceBetween2Element(int[] arr) {

       int  maxDifference = 0;
//       for (int i = 0; i < arr.length; i++) {
//           for (int j = i + 1; j < arr.length; j++) {
//               if(Math.abs(arr[i] - arr[j])  > maxDifference) {
//                   maxDifference = Math.abs(arr[i] - arr[j]);
//               }
//           }
//       }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
       return max-min ;
    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
     int result =    maxDifferenceBetween2Element(arr);

        System.out.print(result);

        sc.close();
    }
}