package Nov.day14_String;

public class StringMethod3_Substring {
    public static void main(String[] args) {
        //substring(beginning index, ending index)

        String word = "Cydeo School";
        String brand = word.substring(0, 4 + 1);
        System.out.println("brand = " + brand);

        String word2 = "Java Programming Language";

        String s1 = word2.substring(0, word2.indexOf(" ")); // java a" "v
        String s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" ")); // programming
        String s3 = word2.substring(word2.lastIndexOf(" ") + 1 );// language. If I don't add a 2nd close
        // then will take on the rest of the sentance.

        //String s4 = word2.substring(word2.indexOf("L"), word2.lastIndexOf("e")+1);// also language

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
       // System.out.println(s4);





    }
}
