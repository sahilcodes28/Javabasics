package B_operators;

public class D_LogicalOperators {
    public static void main(String[] args) {

        int age = 28;
        boolean hasLicence = true;

        System.out.println("age >= 18 && hasLicence : " + (age >= 18 && hasLicence));
        System.out.println("age >= 18 && hasLicence : " + (age >= 18 || hasLicence));
        System.out.println("age >= 18 && hasLicence : " + (!hasLicence));
    }
}
