package Feb.day45_Abstraction.shapeTask;

public abstract class Shape {

    private final String name;
   // public boolean getSide;


    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
