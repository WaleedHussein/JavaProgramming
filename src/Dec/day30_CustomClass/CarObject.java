package Dec.day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Toyota" , "Camry", "Black", 2015, 240000);
        System.out.println(car1);

        car1.start();
        car1.drive();
        car1.stop();

        Car car2 = new Car();
        car2.setInfo("Audi" , "Q7", "Black", 2021, 340000);


        Car car3 = new Car();
        car3.setInfo("BMW" , "353", "Black", 2022, 540000);


        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2 , car3));

        for (Car each : carsList) {

            System.out.println(each.brand + " : " + each.price);
        }

        carsList.removeIf( p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008);

        carsList.removeIf( p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);


    }
}
