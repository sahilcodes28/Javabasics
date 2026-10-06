package Z_practicequestion1;

import java.util.Scanner;

public class U_OddNumbers {
    public static void main(String[] args) {

//       String Scanner sc = new Scanner(System.in);
//
//        int count = 0;
//        for (; ;){
//
//            count++;
//            int n = sc.nextInt();
//            if (n % 2 != 0){
//                break;
//            }
//        }
//        System.out.println(count);
//
//        sc.close();
//    }
// }

//        Scanner sc = new Scanner(System.in);
//
//        int count = 0;
//        int i = 1;
//        while (i > 0){
//
//            count++;
//            int n = sc.nextInt();
//            if (n % 2 != 0){
//                break;
//            }
//        }
//        System.out.println(count);
//
//        sc.close();
//    }
//}

        //must take at least one input before you can check whether it's odd.

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int n;
        do {
            n = sc.nextInt();
            count++;
            }while(n % 2 == 0);

        System.out.println(count);

        sc.close();
    }
}