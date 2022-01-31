package Nov.day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first num");
        int num1 = scan.nextInt();

        System.out.println("enter second num");
        int num2 = scan.nextInt();

        System.out.println("enter math operator");
        char ch = scan.next().charAt(0);

        while (!(ch== '+' || ch == '-')){ // if the operator invalid
            System.out.println("invalid enter again");
            ch = scan.next().charAt(0);
        }

        System.out.println((ch=='+')? num1+num2 : num1-num2);
    }
}
