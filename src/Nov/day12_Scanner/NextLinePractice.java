package Nov.day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
     int age = input.nextInt();

     input.nextLine(); // add this to allow us to enter another input. use after nextInt

        System.out.println("enter full name");
        String fullname = input.nextLine();

        System.out.println("enter gpa");

        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("enter school name");
        String school = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullname = " + fullname);
        System.out.println("gpa = " + gpa);
        System.out.println("school = " + school);

        input.close();
    }
}
