package lab4;

public class Square {
    Point topLeft;
    int length;

    public Square(Point topLeft, int length) {
        this.topLeft = topLeft;
        this.length = length;
    }

    public double perimeter() {
        return length*4;
    }

    public boolean moveSquare(Point newX, Point newY) {
        this.topLeft.x = newX;
        this.topLeft.y = newY;
    }
}