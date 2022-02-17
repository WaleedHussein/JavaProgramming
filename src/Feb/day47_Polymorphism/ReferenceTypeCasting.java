package Feb.day47_Polymorphism;

import Feb.day44_Abstraction.animalTask.Animal;
import Feb.day44_Abstraction.animalTask.Cat;
import Feb.day44_Abstraction.animalTask.Dog;
import Feb.day45_Abstraction.shapeTask.Circle;
import Feb.day45_Abstraction.shapeTask.Shape;
import Feb.day45_Abstraction.shapeTask.Square;
import January.day43_Abstraction.employee.Employee;
import January.day43_Abstraction.employee.Person;
import January.day43_Abstraction.employee.Tester;

public class ReferenceTypeCasting {
    public static void main(String[] args) {

      //  Shape shape = (Shape) new Circle(4); // upcasting, (Shape) not needed, implicit casting

        Shape shape2 = new Circle(5);

        Animal animal = new Dog("Max", "Husky", 'M', 2,"Large", "Blue");

     //   Dog dog = (Dog) animal; // no need to create new variable dog
        ((Dog) animal).bark(); // down casting




        //   Dog dog = (Dog)animal; // downcasting
        //  dog.bark();

        System.out.println( animal.getName() );
        // System.out.println( dog.getName() );

        (  (Dog)animal  ).bark();


        Shape shape1 = new Square(5);

        System.out.println( ((Square) shape1).getSide()  );


        System.out.println("---------------------------------------------------");

        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");

        //Cat cat = (Cat) animal2;
        // cat.meow();

        ( (Cat) animal2 ).meow();

        // ( (Dog) animal2 ).bark();

        System.out.println("---------------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);

        ( (Tester)employee ).bugReport();

        //  ( (Tester)employee ).unitTest();

        //  ( (Developer)employee ).unitTest();

        //  Driver driver = (Driver) employee;  // line 1
        Person person = (Person) employee; // line 2
        //    Teacher teacher = (Teacher) employee; // line 3

        System.out.println("----------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

        //  ( (Cube)s1 ).volume();

    }
}
