package Feb.day45_Abstraction.shapeTask;

public class Circle extends Shape{

    private double r;
    public final static double pi = 3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return r;
    }

    public void setRadius(double r) {
        if (r<0) throw new RuntimeException("radius cannot be negative");
        this.r = r;
    }

    @Override
    public double area() {
        return r*r*pi;
    }

    @Override
    public double perimeter() {
        return 2*r*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+
                ", radius=" + r +
                '}';
    }
}
