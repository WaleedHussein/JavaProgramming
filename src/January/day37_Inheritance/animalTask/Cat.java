package January.day37_Inheritance.animalTask;

public class Cat extends Animal {

    //place the pointer next to animal, hit alt and enter then enter again to create this constructor
    //you can also just select generate constructor, and it will show up right away
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void Scratch(){
        System.out.println(name + " is scratching");
    }




}
