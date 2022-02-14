package Feb.day47_Polymorphism;

public class implicitVsExplicit {
    public static void main(String[] args) {

        int a = 100;
        double b = a; //implicit casting smaller to larg, no need to include ()

        int c = (int) b; //explicit casting large to small,  need to include ()

        System.out.println("a = " + a);

        System.out.println("b = " + b);

        System.out.println("c = " + c);

    }
}
