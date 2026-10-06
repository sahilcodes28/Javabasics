package Z_practicequestion1;

import java.util.*;

public class V_ReverseDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        int reverseNum = 0;
//
//        while ( num > 0){
//
//            reverseNum = reverseNum * 10 + num % 10;
//            num /= 10;
//        }
//        num = reverseNum;
//        System.out.println(num);
//
//        sc.close();
//    }
//}

        int temp = num;
        int count = 1;
        while (temp >= 10) {
            count *= 10;
            temp /= 10;
        }

        int reversedNum = 0;
        int place = 1;

        while (num > 0) {

            int digit = num / count;
            reversedNum = reversedNum + digit * place;
            num %= count;
            count /= 10;
            place *= 10;
        }
        System.out.println(reversedNum);

        sc.close();
    }
}