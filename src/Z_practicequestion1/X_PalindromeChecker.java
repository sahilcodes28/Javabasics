package Z_practicequestion1;

import java.util.*;

public class X_PalindromeChecker {
    public static void main(String[] args){

        Scanner sc = new  Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int digit = 1;

        while (temp >= 10){
            digit *= 10;
            temp /= 10;
        }
        boolean isPalindrome = true;
        for (int i = 1; 2 * i <= num; i++){

            if (num / digit != num % 10){
                isPalindrome = false;
                break;
            }
            num %= digit;
            num /= 10;
            digit /= 100;
        }
        System.out.println(isPalindrome);

        sc.close();
    }
}