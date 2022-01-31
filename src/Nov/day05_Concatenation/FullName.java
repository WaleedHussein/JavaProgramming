package Nov.day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Waleed";
        String lastName = "Hussein";
        int age = 37;
        String jobtitle = "sdet";
        String company = "Apple";
        double salary = 334443.45;
        String FullName = firstName + " " + lastName;
        System.out.println("Full name of the person is " + FullName);
        System.out.println(FullName + " is " + age + " years old");
        System.out.println(FullName + " is " + jobtitle + ", works at " + company
                + ", and " + FullName + "' salary is $" + salary);
    }
}
