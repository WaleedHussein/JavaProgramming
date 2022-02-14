package Feb.day46_Polymorphism;

import Feb.day45_Abstraction.shapeTask.Circle;
import Feb.day45_Abstraction.shapeTask.Square;

public class PolymorphismIntro {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        Integer n1 = 2;
        Double n2 = 5.5;
        boolean r1 = true;

        Object [] array = {str,n1,n2, r1, new Circle(4), new Square( 4)};


    }
}
