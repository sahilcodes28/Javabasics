package Z_practicequestion4;

import java.util.*;

public class C_ArrayProblem4 {

    static void largerArray(int[] arr1, int[] arr2) {

        int sumOfArray1 = 0;
        int sumOfArray2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sumOfArray1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sumOfArray2 += arr2[i];
        }
        if (sumOfArray1 > sumOfArray2) {
            System.out.println("First Array is larger");
        }
        else if (sumOfArray2 > sumOfArray1) {
            System.out.println("Second Array is larger");
        } else {
            System.out.println("Both arrays have the same sum");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of  the array 1 : ");

        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the array 2 : ");

        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        C_ArrayProblem4.largerArray(arr1, arr2);
    }
}