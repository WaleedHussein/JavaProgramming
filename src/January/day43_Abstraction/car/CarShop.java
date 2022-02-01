package January.day43_Abstraction.car;

public class CarShop {
    public static void main(String[] args) {

        Honda honda = new Honda("Civic", "Blue", 2020,22000);
        Audi audi = new Audi("Q7", "Blue", 2022,50000);
        Tesla tesla = new Tesla("model3", "Silver", 2021, 70000);

    honda.setColor("purple");


        System.out.println(honda);
    }
}
