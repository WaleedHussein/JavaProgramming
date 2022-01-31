package Nov.day07_Operators;

public class Castings {
    public static void main(String[] args) {
        float averageScore = 20.5f;
        byte num1 = (byte)averageScore; //explicit casting
        int num3 = (short)averageScore; // explecit casting we can go int to smaller, but cannot go int to long
        double num4 = averageScore; //implicit
        System.out.println("num1 = " + num1);
    }
}
