package Code;

//import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    public static void main(String[] args) {
        Shape[] rectangle = new Rectangle[2];
        rectangle[0] = new Rectangle();
        rectangle[1] = new Rectangle("red", false, 15, 10);
        for (Shape rectangles: rectangle){
            ((Rectangle)rectangles).howColor();
            System.out.println(((Rectangle)rectangles).getArea());
        }
    }

}