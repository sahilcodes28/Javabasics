package F_array;

import java.util.*;

public class E_ReverseAnArray {

    static void reverseArray(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {

            int start = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = start;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int Size = sc.nextInt();
        int[] arr = new int[Size];

        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        E_ReverseAnArray.reverseArray(arr);

        System.out.print("The reversed array is : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

            sc.close();
        }
    }
}