package Nov.day08_IfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number = 300;
        boolean evenNumber = number%2 == 0;
        boolean oddNumber = !evenNumber;
        if (evenNumber){
        System.out.println(number +" is even number");}
        if (oddNumber){
            System.out.println(number + " is odd");}

        int n = 0;
        if ( n >0){
            System.out.println(n+" is positve");}
        if (n<0){
            System.out.println(n + " is negative");
        }
        if (n == 0){
            System.out.println(n + " is zero");
        }

    }

}
