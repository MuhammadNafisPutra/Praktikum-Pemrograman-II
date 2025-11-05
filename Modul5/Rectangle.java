package PRAK5001;

public class Rectangle extends Shape {
    private Double length;
    private Double width;

    public Rectangle(Double l, Double w) {
        super("Rectangle");
        length = l;
        width = w;
    }

    public double area(){
        return length*width;
    }

    public String toString(){
        return super.toString() + " of length " + length + " and width " + width;
    }
}