package Nov.day04_Variable;

public class PrimitivesIntro {
    public static void main(String[] args) {
        // age = 38
        //weight = 160
        byte age = 38;
        //byte ages = 777;  777 is out of range
        short weight = 160;
        int salary = 100_000; //the _ is used instead of comma to sepearate thousands
        long asset = 33333333333333L; // by default compiler reads numbers as int so why must use L for long
        long my = 5555555555555l;
        float tax = 0.26f; // when using float, put F. double is the default
        double pi = 3.4;

        char mike = 'B';
        System.out.println("mike = " + mike);
        String meme = "hello";
        System.out.println("meme = " + meme);


    }
}
