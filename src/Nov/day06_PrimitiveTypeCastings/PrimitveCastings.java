package Nov.day06_PrimitiveTypeCastings;

public class PrimitveCastings {
    public static void main(String[] args) {

       double l = 899999.5;
       float m = (float)l;
        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int)n;
        System.out.println(n + " : " +s);
        /*
        implicit casting, from small prim to larger: int to long
        explicit casting, from larget to smaller: long to int
         */
        double d1 = 20.5;
        //short s1 = d1; // to correct this casting error, hit alt+enter and hit cast to short first option
        short s1 = (short) d1;

    }
}
