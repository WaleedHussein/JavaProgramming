package January.day37_Inheritance.phoneTask;

public class Iphone extends Phone {



    public Iphone( String model, String size, double price, String color) {//String brand is taken off because
        // we know the prand is Apple
        super("Apple", model, size, price, color);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " is having facetime with phone number: " + phoneNumber );
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " is having facetime with email: " + email );
    }






}
