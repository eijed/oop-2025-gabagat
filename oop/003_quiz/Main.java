public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);

        System.out.println(r.getArea());
    }
}

// `Rectangle` is a class that accepts height and weight.
// It provides a function `getArea` that returns the area
// of the rectangle.
//
// TODO: Fix our Rectangle class
??? Rectangle {
    int h;
    int w;

    public Rectangle(int h, int w) {
        ???.h = h;
        ???.w = w;
    }

    public int getArea() {
        return ???.h * ???.w;
    }
}