package Code;


class SquareTest {
    public static void main(String[] args) {
        Shape[] squares = new Square[3];
        squares[0] = new Square("red", true, 1.0, 2.0, 3.0);
        squares[1] = new Square();
        squares[2] = new Square("yellow", false, 2.0, 3.0, 6.0);

        for (Shape square: squares){
            ((Square)square).howColor();
            System.out.println(((Square)square).getArea());
        }
    }
}