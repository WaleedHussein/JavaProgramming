package Nov.day16_ForLoopsStringPractice;

public class Reverse {
    public static void main(String[] args) {

        String str = "Wooden Spoon";

        String result = ""; // contain the reverse of str

      //  result += str.charAt(str.length() -1); //n

        for (int i = str.length() -1; i >= 0 ; i--) {
        result +=str.charAt(i);

        }



        System.out.println("result = " + result);

    }
}
