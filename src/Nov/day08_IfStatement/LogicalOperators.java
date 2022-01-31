package Nov.day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "steven";
        int age = 19;
        String citizen = "Iraq";
        boolean elegible = age >= 18 && citizen == "USA";
        System.out.println(name + " is elegible to vote: " + elegible);
       // if (elegible) false then System.out.println ("-_-");
        System.out.println("---------------------");
        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender =='F');
        System.out.println(name3 + " is eligible to register: " + isEligible3);


    }
}
