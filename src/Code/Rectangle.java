package Code;

public class Rectangle extends Shape implements Colorable {
    private double height = 1.0;
    private double width = 1.0;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double height, double width) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return this.height * this.width;
    }

    @Override
    public String toString() {
        return "A Rectangle:" +
                getHeight() +
                getWidth() + "which a subclass: " + super.toString();
    }

    @Override
    public void howColor() {
        System.out.println("Color all four sides.");
    }
}
