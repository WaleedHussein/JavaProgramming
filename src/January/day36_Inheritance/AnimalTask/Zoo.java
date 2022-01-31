package January.day36_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {

     Dog dog = new Dog();
     dog.setInfo("Max", "Husky", 'M',2, "Small","Black");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.bark();

        Cat cat = new Cat();
        cat.setInfo("Buggy", "British", 'F', 1,"Small","Blue");
        cat.eat();
        cat.scratch();
        cat.sleep();

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4,"Large", "Yellow");
        tiger.eat();
        tiger.drink();
        tiger.hunt();

    }
}
