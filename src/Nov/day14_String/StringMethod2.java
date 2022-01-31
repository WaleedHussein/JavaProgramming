package Nov.day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java";
      String str2 =  str.replace("Java", "Pythod");

        System.out.println("str2 = " + str2);

        String email = "johnsmith@yahoo.com";

        String email2 = email.replace("yahoo", "gmail");

        System.out.println("email2 = " + email2);

        String sentance = "java java python python c# C# c++ c++ python python";
        String sentance2 = sentance.replace("python", ""); // this will delete all python

        System.out.println("sentance2 = " + sentance2);
        sentance2 = sentance2.replace("   ", " "); // this will get rid of empty spaces

        System.out.println("sentance2 = " + sentance2);

        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat"); //"Cat ...."

        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";

        s2 = s2.replace(" C#", " Java");
        //s2 = s2.replace("C# is c", "Java is c");

        System.out.println("s2 = " + s2);

        String s3 = "Java";

        s3 = s3.replace("a", "e"); //"Jeve"

        System.out.println(s3);

        System.out.println("--------------------------------------------");

        String result = "Java Java Java";

        //result = result.replace("Java", "Python");
        result = result.replaceFirst("Java", "Python");
        System.out.println(result);

        String result2 = "C# is fun, C# is cool";

        result2 =  result2.replaceFirst("C#", "Java");

        System.out.println(result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("va", "vo"); //"Jova"

        System.out.println(result3);




    }
}
