package Dec.day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.color = "White";
        dog1.size = "Small";

        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.name = "Ace";
        dog2.breed = "Husky";
        dog2.age = 2;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German", 2, 'M', "Large", "White");
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Dogi", "Labrador", 3, 'M', "Medium", "Yellow");


        Dog dog5 = new Dog();
        dog5.setInfo("Bobo", "Doberman", 1, 'F', "Small", "Black");


        Dog [] dogs = {dog1, dog2, dog3 , dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>(); //loop
       // femaleDogs.addAll(Arrays.asList(dog1,dog2,dog3,dog4, dog5));


        for (Dog each : dogs) {

            if (each.gender == 'F'){
                femaleDogs.add(each);
            }

        }

        ArrayList<Dog> maleDogs = new ArrayList<>(); // no loop
        maleDogs.addAll(Arrays.asList(dog1,dog2,dog3,dog4, dog5));
        maleDogs.removeIf( p -> p.gender == 'F');


        System.out.println("femaleDogs = " + femaleDogs);
        System.out.println("maleDogs = " + maleDogs);






    }
}
