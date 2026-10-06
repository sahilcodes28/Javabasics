package E_Method;

 // Declaration and Method Calling

public class A_MethodProblem1 {

    public static void fun() {
        System.out.println("I am another Function");
    }

    public void fun2() {                                          // No parameter + No return value
        System.out.println("I am 2nd Function");
    }

    public static void  greet(String name) {                      // Parameter = variable that receives a value
        System.out.println("Hello " + name);                      // Parameter + No return value
    }
    public static int  getAge() {                                    // no parameter + return value
        return 10;
    }

    public static int sum(int a, int b) {
        return a + b;                                             // Parameter +  return value
    }

    public static void main(String[] args) {

        A_MethodProblem1.fun();                                  // calling without creating an object

        A_MethodProblem1 obj = new A_MethodProblem1();
        obj.fun2();                                             // call the method after creating an object

        // Parameters and Arguments

        A_MethodProblem1.greet("sahil");                 // Argument = actual value passed to the method.


        // Return a value

        int age = A_MethodProblem1.getAge();
        System.out.println("Age : " + age);

       int result =  A_MethodProblem1.sum(10 , 30);                 // Argument = actual value passed to a method.

        System.out.println("Result : " + result);
    }
}