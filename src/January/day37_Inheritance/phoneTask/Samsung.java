package January.day37_Inheritance.phoneTask;

public class Samsung extends Phone {

    public Samsung( String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void call(long phoneNumber){
        System.out.println(brand + " " + model + " is calling phone: " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand + " " + model + " is texting phone: " + phoneNumber);
    }





}
