package Nov.day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 14;
        String result = (n > 0)? "Positive" :(n < 0)? "negative" :("zero");
        System.out.println(result);

        String month="";
     /* month =  (n == 1)? "Jan" :(n==2)? "Feb" :(n==3)? "Mar" :(n==4)? "April"
              :(n==5)? "May" :(n==6)? "June" :(n==7)? "July" :(n==8)? "Aug"
              :(n==9)? "Sep" :(n==10)? "Oct" :(n==11)? "Nov" : "Dec";
        System.out.println(month);
*/
        System.out.println("-------------------------------");
        month = (n>= 1 && n<= 12)?  (n == 1)? "Jan" :(n==2)? "Feb" :(n==3)? "Mar" :(n==4)? "April"
                :(n==5)? "May" :(n==6)? "June" :(n==7)? "July" :(n==8)? "Aug"
                :(n==9)? "Sep" :(n==10)? "Oct" :(n==11)? "Nov" : "Dec" : "invalid";
        System.out.println(month);
    }
}
/*
if  :      (condition)? then type the answer "something"
else:      :(condition) "something else"
else if:   :(condition)? (something"
then assign it to a string and print or put it into a sout
 */