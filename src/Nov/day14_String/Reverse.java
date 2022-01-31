package Nov.day14_String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a 5 char string");
        String word = input.next();
        int length = word.length();
        String reverse = "";
        if (length == 5){
           reverse = ""+ word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1)+ word.charAt(0);

        }else if (length < 5){
            reverse = "Too short";
        }else {
            reverse = "Too long";
        }
        System.out.println(reverse);

    }
}
/*
1.  Create a class called Reverse, write a program that will reverse a string. Your program should reverse a
string only 5 characters long. If word is shorter, display message: "Too short!". If word is longer, display
message: "Too long!". Otherwise, reverse this word and print out result into the console.

 */