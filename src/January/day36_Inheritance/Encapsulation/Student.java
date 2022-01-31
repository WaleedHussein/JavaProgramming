package January.day36_Inheritance.Encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age< 5 || age > 90){
            return; //using return instead of system.exit will move on to next code instead of terminating the program
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender== 'F')){
            System.err.println("wrong gender");
            System.exit(0);
        }
        this.gender = gender;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
