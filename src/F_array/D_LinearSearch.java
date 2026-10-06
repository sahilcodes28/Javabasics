package F_array;

import java.util.*;

public class D_LinearSearch {

    static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        System.out.print("Enter the target elements : ");
        int target = sc.nextInt();

        System.out.print("Enter the elements of the array : ");

        int [] arr = new int [size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = D_LinearSearch.linearSearch(arr,target);

        if (result == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Target found at index: " + result);
        }

        sc.close();

    }
}