package F_array;

import java.util.*;

public class B_TraversingAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements: ");

        // output
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }
        sc.close();
    }
}