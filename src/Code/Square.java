package Code;

public class Square extends Shape implements Colorable{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Square() {
    }

    public Square(String color, boolean filled) {
        super(color, filled);
    }

    public Square(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Square(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }
    public double getArea(){
        return Math.sqrt(getPerimeter() * (getPerimeter() - this.side1) * (getPerimeter() - this.side2) * (getPerimeter() - this.side3));
    }

    @Override
    public void howColor() {
        System.out.println("Color all three sides.");
    }
}
