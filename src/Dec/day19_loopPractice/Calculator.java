package Dec.day19_loopPractice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = scan.nextInt();
        System.out.println("enter operator");
        char operator = scan.next().charAt(0); // use charat since there is none for char
        if (!(operator == '+' || operator == '-')){
            System.err.println("invalid operator" + operator);
            System.exit(0); // terminates the whole program
        }

        System.out.println("enter 2nd num");
        int num2 = scan.nextInt();


        if (operator == '-'){
            System.out.println(num1 - num2);
        }else{
            System.out.println(num1 + num2);
        }


    }
}
