package Z_practicequestion4;

import java.util.*;

public class D_Buildings {

    static void building(int [] arr){

        int maxHeight = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxHeight) {
                maxHeight = arr[i];
            }
        }
            for (int i = maxHeight; i >= 1; i--){
                for (int j = 0; j < arr.length; j++){

                    if (arr[j] >= i) {
                        System.out.print("*\t");
                }
                    else {
                    System.out.print("\t");
                    }
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        D_Buildings.building(arr);

        sc.close();
    }
}