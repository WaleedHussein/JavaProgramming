package January.day39_Recap;

public class Shape {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){

        if (name == null){
            System.exit(1); // 1 means something went wrong
        }

        this.name = name;
    }

    public Shape(String name){
        setName(name);
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }




}
