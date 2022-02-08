package Feb.day45_Abstraction.shapeTask;

public class Square extends Shape{

    private double side;

    public Square(String name, double side) {
        super(name);
        setSide(side);
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString() +
                ", side=" + side +
                '}';
    }
}
