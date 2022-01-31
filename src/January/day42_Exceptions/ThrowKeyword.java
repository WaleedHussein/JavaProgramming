package January.day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("Enter your age");
        //Scanner scan = new Scanner(System.in);
        int age = new Scanner (System.in).nextInt();

        if (age < 0){
           // System.out.println("invalid age");
            //System.exit(1); it is better if I manually throw an exception
            throw new InputMismatchException("Age cannot be negative" + age);
        }
        if (age<21){
            throw new InputMismatchException("Too young" + age);
        }
        if (age > 21){
            System.out.println("Elegible to buy");
        }


    }
}
