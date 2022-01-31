package Nov.day15_ForLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -2147483648;//the smallest number in integer int
        int min = 2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number");
            int maximum = scan.nextInt();

            if (maximum>max){
              max = maximum;

            }else if (maximum<min){
                min = maximum;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        scan.close();
    }
}
/*
write a program to ask a user to enter a number for 5 times,
return the max number
 */