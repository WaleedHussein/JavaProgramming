package Feb.day45_Abstraction.shapeTask;

public class Cube extends Shape implements Volume{

    private double length;
    private double height;
    private double width;

    public Cube(String name, double length, double height, double width) {
        super(name);
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return length*width*height;
    }
}
