package Dec.day31_Constructors;

public class Student {

    public String name;
    public int age;
    public char gender, grade;
    public int id;

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", id=" + id +
                '}';
    }

    public Student(String name, int age, char gender, char grade, int id) { // right click, generate, constructor
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.id = id;



    }
}
