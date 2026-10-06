package Z_practicequestion4;

import java.util.*;

public class F_LargestNumberAtLeastTwiceofOthers {

    static int largestNumberAtLeastTwice(int [] arr) {

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if ( i != index && arr[index] < 2 * arr[i]) {
                return -1;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(largestNumberAtLeastTwice(arr));
    }
}