public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Tinh the tich
    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder [radius =" + getRadius() + ", color = " + getColor() + ", height = " + height + ", volume = " + getVolume() + "]";
    }
}