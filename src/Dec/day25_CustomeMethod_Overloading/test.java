package Dec.day25_CustomeMethod_Overloading;

import utilities.StringUtility;

public class test {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
       String reverse =  StringUtility.reverse(str);
        System.out.println("reverse = " + reverse);


        String s = "level";

        boolean palindrome = StringUtility.isPalindrome(s);
        System.out.println("palindrome = " + palindrome);

        int count = 0;
        String [] arr = {"anna", "mike", "level"};

        for (String each : arr) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println("count = " + count);

    }
}
