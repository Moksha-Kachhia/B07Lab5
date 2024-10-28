package lab4;
import java.util.Math;

public class Circle {
	Point center;
	double radius;
	
	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI*(Math.pow(this.radius, 2));
	}
	
	public void moveCircle(double newX, double newY) {
		center.x += newX;
		center.y += newY;
	}

}
