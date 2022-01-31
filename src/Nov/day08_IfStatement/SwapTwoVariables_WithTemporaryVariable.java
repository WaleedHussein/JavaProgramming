package Nov.day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = a;
        a = b;
        b = c;

        System.out.println("a = " + a); // should change to 15
        System.out.println("b = " + b); // should change to 10
        System.out.println("5 +2 = "+ (3+1));
        long  f = 30L;

        long  g= (short) f;
        System.out.println("g = " + g);
    }
}
