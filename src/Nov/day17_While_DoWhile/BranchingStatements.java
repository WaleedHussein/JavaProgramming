package Nov.day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {
        for (char i = 'A'; i <='M' ; i++) {
            System.out.print(i);

            if (i == 'F'){
                break;//exits the loop
            }

        }

        System.out.println("------------------");
        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("enter a number");
            int num = scan.nextInt();

            if (num <6){
                break;
            }

        }




    }
}
