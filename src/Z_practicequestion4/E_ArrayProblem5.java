package Z_practicequestion4;

import java.util.*;

public class E_ArrayProblem5 {

    static int countConsecutivePairs(int[] arr, int k) {

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] == k) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.print("Enter the compare number: ");
        int k = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = E_ArrayProblem5.countConsecutivePairs(arr, k);

        System.out.print(result);

       sc.close();
    }
}