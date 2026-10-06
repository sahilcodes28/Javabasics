package Z_practicequestion1;

import java.util.*;

public class G_CircleAreaPerimeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        double areaOfCircle = 3 * radius * radius;          // NOTE : TAKE PI AS 3
        double perimeterOfCircle = 2 * 3 * radius;

        System.out.println("The area of the circle is " + areaOfCircle);
        System.out.println("The perimeter of the circle is " + perimeterOfCircle);

        sc.close();
    }
}
