package Dec.day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayPractice3 {
    public static void main(String[] args) {

        System.out.println("how many numbers do you want to enter?");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n <= 0){
            System.err.println("error");
            System.exit(0);
        }

        int [] numbers = new int[n];

        for (int i = 0; i < n ; i++) {
            System.out.println("enter number");
            numbers[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(numbers));


    }
}
