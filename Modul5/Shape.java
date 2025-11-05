package PRAK5001;

public abstract class Shape {
    protected String shapeName;

    public Shape(String Name) {
        this.shapeName = Name;
    }

    public abstract double area();

    public String toString() {
        return shapeName;
    }
}
