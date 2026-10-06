package Z_practicequestion4;
import java.util.*;

public class G_SumofArrayExceptSelf {

    static int [] sumArrayExceptSelf(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sum - arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int [] result = sumArrayExceptSelf(arr);

        for (int i = 0 ; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}