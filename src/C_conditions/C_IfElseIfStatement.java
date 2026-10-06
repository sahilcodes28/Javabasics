package C_conditions;

import java.util.Scanner;

public class C_IfElseIfStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks <= 0 || marks > 100) {
            System.out.println("NOT VALID");

        } else if (marks >= 30 && marks < 40) {
            System.out.println("GRADE: F");

        } else if (marks >= 40 && marks < 50) {
            System.out.println("GRADE: E");

        } else if (marks >= 50 && marks < 60) {
            System.out.println("GRADE: D");

        } else if (marks >= 60 && marks < 70) {
            System.out.println("GRADE: C");

        } else if (marks >= 70 && marks < 80) {
            System.out.println("GRADE: B");

        } else if (marks >= 80 && marks < 90) {
            System.out.println("GRADE: A");

        } else if (marks >= 90 && marks <= 100) {
            System.out.println("GRADE: A+");

        } else {
            System.out.println("FAIL");
        }
        sc.close();
    }
}