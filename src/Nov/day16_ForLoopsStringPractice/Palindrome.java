package Nov.day16_ForLoopsStringPractice;

public class Palindrome {
    public static void main(String[] args) {

        String word = "hello";

        String reversed = "";

        for (int i = word.length()-1; i >= 0 ; i--) {
            reversed += word.charAt(i);
        }
        boolean isPalindrom = reversed.equalsIgnoreCase(word);

        System.out.println("reversed = " + reversed);
        System.out.println("isPalindrom = " + isPalindrom);




    }
}
