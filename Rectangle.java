package lab4;

public class Rectangle {
Point A,B,C,D;
Rectangle(){
}
Rectangle(Point A, Point B, Point C, Point D)
{this.A=A;
this.B=B;
this.C=C;
this.D=D;
	}
public double perimeter() {
return A.distance(B)+B.distance(C)+C.distance(D)+D.distance(A);
}
public double area() {
	return (A.distance(B)) * (B.distance(C));
}

}
