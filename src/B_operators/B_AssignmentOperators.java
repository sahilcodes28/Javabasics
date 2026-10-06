package B_operators;

public class B_AssignmentOperators {
    public static void main(String[] args) {

        int a = 28;

        a += 8;      // a = a + 8
        System.out.println("After += : " + a);

        a -= 10;    // a = a - 10
        System.out.println("After -= : " + a);

        a *= 5;     // a = a * 5
        System.out.println("After *= : " + a);

        a /= 6;     // a = a / 5
        System.out.println("After /= : " + a);

        a %= 2;     // a = a % 2
        System.out.println("After %= : " + a);
    }
}
