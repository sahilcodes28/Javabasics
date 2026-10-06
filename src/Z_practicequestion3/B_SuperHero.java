package Z_practicequestion3;

import java.util.Scanner;

public class B_SuperHero {

    public static String modifyName(String name){
        return (name + " is a Super Hero.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println (modifyName(name));

        sc.close();
    }
}
