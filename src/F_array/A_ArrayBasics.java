package F_array;


public class A_ArrayBasics {
    public static void main(String[] args) {

        int [] arr;                              // array declaration
        arr = new int [] {1,2,3,4,5,};          // array  declaration + creation + values

        int []  arr2 = new int [5];              // declaration + creation

        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;
        arr2[4] = 50;

        System.out.println(arr[0]);
        System.out.println(arr[2]);
        System.out.println(arr[4]);
    }
}