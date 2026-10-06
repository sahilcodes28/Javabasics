package Z_practicequestion4;

import java.util.*;

public class I_ArrayProblem6 {

    public static int shortestDistance(int[] arr,int size) {
//
//        int count = 0;
//        for (int i = 0; i < size; i++) {
//            if (arr[i] % 2 == 0 && arr[i] > 0) {
//                count++;
//            }
//        }
//
//        if (count <= 1 || size <= 1) {
//            return -1;
//        }
//        else {
//            int shortestDistance = Integer.MAX_VALUE;
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = i + 1; j < arr.length; j++) {
//                    if (arr[i] % 2 == 0 && arr[i] > 0  && arr[j] % 2 == 0 && arr[j] > 0) {
//                        if (shortestDistance > (j - i)) {
//                            shortestDistance = (j - i);
//                        }
//                    }
//                }
//            }
//            return shortestDistance;
//
//        }

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int result = shortestDistance(arr, size);

        System.out.print(result);
        sc.close();
    }
}