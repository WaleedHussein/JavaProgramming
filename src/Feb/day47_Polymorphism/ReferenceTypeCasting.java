package Feb.day47_Polymorphism;

import Feb.day44_Abstraction.animalTask.Animal;
import Feb.day44_Abstraction.animalTask.Dog;
import Feb.day45_Abstraction.shapeTask.Circle;
import Feb.day45_Abstraction.shapeTask.Shape;
import Feb.day45_Abstraction.shapeTask.Square;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

      //  Shape shape = (Shape) new Circle(4); // upcasting, (Shape) not needed, implicit casting

        Shape shape2 = new Circle(5);

        Animal animal = new Dog("Max", "Husky", 'M', 2,"Large", "Blue");

     //   Dog dog = (Dog) animal; // no need to create new variable dog
        ((Dog) animal).bark(); // down casting

       Shape shape1 = new Square(4);

       System.out.println(((Square) shape1).getSide());
    }
}
