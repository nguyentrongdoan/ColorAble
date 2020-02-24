package Code;

public class Circle extends Shape implements Colorable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public void howColor() {
        System.out.println("Color all one round sides.");
    }
}
