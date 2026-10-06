package E_Method;

public class B_MethodOverloading {
    public int multiply(int a, int b){
        return a*b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public static void main(String[] args) {

        B_MethodOverloading obj = new B_MethodOverloading();

        int multiplication = obj.multiply(10,20);
        double multiplication2 = obj.multiply(28.2,12.22);

        System.out.println(multiplication);
        System.out.println(multiplication2);


    }
}
