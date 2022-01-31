package Nov.day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {

        //System.out.println(true == !false);

        int score = 65;
        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && !a; // !a means it is not an A
        boolean c = score >= 80 && score <= 79;
        boolean d = score >= 60 && !a && !b && !c;

        if (a){
            System.out.println("A");
        }
        if (d){
            System.out.println("D");
        }

    }
}
