package Nov.day04_Variable;

public class Circle {
    public static void main(String[] args) {
        double PI = 3.14;
        double radius = 3.5;
        double diameter = radius * 2;
        double area = PI * radius * radius;
        double Perimeter = diameter * PI;
        System.out.println("area = " + area);
        System.out.println("Perimeter = " + Perimeter);


    }
}

//3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
//                    Hints:  PI = 3.14
//                            area = radius * radius * PI
//                            Perimeter = 2 * radius * PI