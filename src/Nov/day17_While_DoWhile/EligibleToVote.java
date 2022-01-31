package Nov.day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter age");
        int age = scan.nextInt();

        while (!(age >= 1 && age <= 120)){
            System.out.println("error enter again");
            age = scan.nextInt();
        }
        System.out.println("are you us citizen? yes/no");
        String answer = scan.next().toLowerCase();//or use equaliqnore
        while (!(answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("no"))){
            System.out.println("error enter again");
            answer = scan.next().toLowerCase();
        }

        if (answer.equalsIgnoreCase("yes")){

        if (age<21){
            System.out.println("ineligible to vote");
        }else {
            System.out.println("eligible to vote");
        }}else {
            System.out.println("non us citizen, cannot vote");
        }
/*
        while( !(answer.equals("yes") || answer.equals("no")) ){
            System.err.println("Invalid entry, please re-enter");
            System.err.println("Are you a US citizen? yes/no");
            answer = scan.next().toLowerCase();
        }

        if(age >= 18 && answer.equals("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
 */
    }
}
