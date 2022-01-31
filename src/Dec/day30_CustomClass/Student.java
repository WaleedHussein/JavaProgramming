package Dec.day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public char grade;
    public int ID;


// right click, generate, constructor, select all, add void and setInfo and remove the given name.
    public void setInfo(String name, char gender, int age, char grade, int ID) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
        this.ID = ID;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", grade=" + grade +
                ", ID=" + ID +
                '}';
    }

    public void code(){
        System.out.println(name + " is coding");
    }
}
