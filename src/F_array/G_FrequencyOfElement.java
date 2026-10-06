package F_array;

import java.util.*;

public class G_FrequencyOfElement {

   static int frequencyOfElement(int[]arr,int target) {
       int frequency = 0;
       for (int i = 0; i < arr.length; i++){
           if (arr[i] == target){
               frequency++;
           }
       }
       return frequency;
   }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target =  sc.nextInt();

        int [] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print(frequencyOfElement(arr,target));

        sc.close();
    }
}