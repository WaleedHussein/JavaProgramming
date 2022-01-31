package Nov.day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 101; i++) {  //type fori then enter
            sum += i;

        }
        System.out.print(sum);
        System.out.println();
        System.out.println("----------------------");

        Scanner input = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("enter number");
            total+= input.nextInt();
        }

input.close();
    }
}
