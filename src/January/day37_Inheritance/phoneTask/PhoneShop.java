package January.day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7", 1000,"Black");
        Samsung samsung = new Samsung("Note 10+","6.9", 999,"Blue");
        Nokia nokia = new Nokia("Brick", "4 inches", 50,"Grey");


        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

    }
}
