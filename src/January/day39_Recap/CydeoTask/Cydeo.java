package January.day39_Recap.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Developer developer = new Developer("Jasim", 55,'M',3442,"Nazah Tahair", 125000);
        Tester tester = new Tester("Waleed", 37,'M', 3333, 3334);
        Student student = new Student("Hulya",27,'F',342,"IT");

        developer.setAge(39);
        System.out.println(developer);



    }
}
