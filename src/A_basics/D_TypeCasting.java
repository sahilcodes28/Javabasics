package A_basics;

public class D_TypeCasting {
    public static void main(String[] args) {

        //Widening Casting: smaller data type -> larger data type
        int number = 100;
        double decimalNumber = number;

        System.out.println(number);
        System.out.println(decimalNumber);

        //Narrowing Casting: larger data type -> smaller data type
        double price = 5999.99;
        int wholePrice = (int) price;

        System.out.println(price);
        System.out.println(wholePrice);
    }
}
