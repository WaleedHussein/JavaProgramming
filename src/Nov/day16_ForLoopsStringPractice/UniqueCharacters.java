package Nov.day16_ForLoopsStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabccc";
        String result = "";

       /*
        if (str.indexOf('a') == str.lastIndexOf('a')){// if first and last index of char same, then unique
            result += 'a';
        }
        */


        for (char i = 0; i < str.length(); i ++){
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                result += ch;
            }

        }
        System.out.println("result = " + result);


    }
}
