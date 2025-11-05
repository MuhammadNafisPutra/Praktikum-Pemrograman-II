package PRAK5001;

public class Cylinder extends Shape{
    private Double radius;
    private Double height;

    public Cylinder(Double r, Double h){
        super("Cylinder");
        radius = r;
        height = h;
    }

    public double area(){
        return Math.PI * (radius*radius) * height;
    }

    public String toString(){
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}