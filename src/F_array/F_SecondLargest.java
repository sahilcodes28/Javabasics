package F_array;

import java.util.*;

public class F_SecondLargest {

//    static int secondLargest(int[] arr) {
//
//        // second largest element including duplicates and elements are not negative
//        int index = 0;
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[index] < arr[i]) {
//                index = i;
//            }
//        }
//        int secondMax = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (index == i) {
//                continue;
//            }
//            if (secondMax < arr[i]) {
//                secondMax = arr[i];
//            }
//        }
//        return secondMax;
//    }
    static int secondLargest(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }  else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = secondLargest(arr);

        System.out.print(result);
    }
}