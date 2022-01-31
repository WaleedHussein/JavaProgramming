package January.day36_Inheritance.Encapsulation;

import January.day36_Inheritance.Encapsulation.Student;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("HULYA" ,  27 , 'F' , 'A', "Cydeo");
        System.out.println(student1);

        student1.setAge(33);

        System.out.println(student1);


    }
}
