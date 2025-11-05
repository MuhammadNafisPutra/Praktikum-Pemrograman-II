package PRAK5001;

public class Sphere extends Shape{
    private Double radius;

    public Sphere(Double r){
        super("Sphere");
        radius = r;
    }

    public double area(){
        return 4 * Math.PI * (radius * radius);
    }

    public String toString() { // [cite: 60]
        return super.toString() + " of radius " + radius;
    }

}