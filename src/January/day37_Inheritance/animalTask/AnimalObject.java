package January.day37_Inheritance.animalTask;

public class AnimalObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", 'M', 2,"Small", "White");
        Cat cat1 = new Cat("Love", "Siamese", 'F', 2,"Large", "Black");
        Parrot parrot1 = new Parrot("King", "Mcaow", 'M', 4,"Small", "Green");

        cat1.Scratch();
        System.out.println(cat1);
        dog1.bark();
        System.out.println(dog1);
        parrot1.sing();
        System.out.println(parrot1);


    }
}
