package Nov.day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 5;
        ++a; // pre increment - increase value by 1 right away
        System.out.println("a = " + a);
        --a; // pre decrement - reduce value by 1 right away
        System.out.println("a = " + a);
        System.out.println("----------------");
        int b = 100;
        System.out.println(++b); // pre increment
        int c = 100;
        System.out.println(c++); // post increment - first pass current value then increase by 1
        System.out.println(c);
        System.out.println("----------------");

        int x = 200;
        System.out.println(--x);// pre decrement, decrease by 1 immediately
        int y = 200;
        System.out.println(y--); // post decrement, first pass current value then decrease by 1
        System.out.println(y);
        System.out.println("-------------------------");

        int z = 45;
        System.out.println(++z);//46
        System.out.println(z++);//46, z = 47
        System.out.println(z);//47
        System.out.println("---------------------------");

        int q = 30;
        System.out.println(--q);//29
        System.out.println(q--);//29, q = 28
        System.out.println(q);//28
        System.out.println("---------------------------");





    }
}
