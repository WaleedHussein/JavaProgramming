package Dec.day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Waleed", 'M', 37, 'A', 2234);

        Student student2 = new Student();
        student2.setInfo("Aygun", 'F', 39, 'F', 2210);

        Student student3 = new Student();
        student3.setInfo("Hulya", 'F', 29, 'B', 2200);

        Student student4 = new Student();
        student4.setInfo("Ali", 'M', 19, 'C', 2610);

        Student student5 = new Student();
        student5.setInfo("Nawar", 'M', 30, 'A', 3210);

        Student[] students = {student1,student2, student3, student4, student5};

        for (Student each : students) {
            System.out.println(each);
        }

        ArrayList<Student> earlyBird = new ArrayList<>();
        ArrayList<Student> angryBird = new ArrayList<>();

        for (Student each : students) {
            if (each.grade == 'A'){
                earlyBird.add(each);
            }
            if (each.grade != 'A'){
                angryBird.add(each);
            }
        }

        System.out.println("earlyBird = " + earlyBird);
        System.out.println("angryBird = " + angryBird);



    }
}
