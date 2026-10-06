package A_basics;
import java.util.Scanner;
public class E_UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Gender: ");
        String gender = sc.next();
        sc.nextLine();                                      // consume leftover Enter
        System.out.println("Gender : " + gender);

        System.out.print("Enter your FullName: ");
        String fullName = sc.nextLine();
        System.out.println("Full Name : " + fullName);

        System.out.print("Enter your FavNum: ");
        byte favNumber = sc.nextByte();
        System.out.println("Favourite Number : " + favNumber);

        System.out.print("Enter your BirthYear: ");
        short birthyear = sc.nextShort();
        System.out.println("Birth Year : " + birthyear);

        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Age : " + age);

        System.out.print("Enter your ID: ");
        long id = sc.nextLong();
        System.out.println("ID : " + id);

        System.out.print("Enter your Salary: ");
        double salary = sc.nextDouble();
        System.out.println("Salary : " + salary);

        System.out.print("Enter your Bonus: ");
        float bonus = sc.nextFloat();
        System.out.println("Bonus : " + bonus);

        System.out.print("You have License? (True/False): ");
        boolean hasLicence = sc.nextBoolean();
        System.out.println("Licence : " + hasLicence);

        sc.close();
    }
}