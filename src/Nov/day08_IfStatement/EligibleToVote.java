package Nov.day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Josh", citizen = "USA";
        int age = 38;
        boolean isEligible = age >= 21 && citizen == "USA";

        //eligible
        if (isEligible){
            System.out.println(name + " is eligible");
            // ! means the opposite of something
            //not eligible
            if (!isEligible){
                System.out.println(name+" not eligible");
            }
        }

    }
}
