package lab4;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class SquareTestFinal {

	@Test
	public void testNotNull() {
		Point topLeft = new Point(0,0); 
		Square testSquare = new Square(topLeft, 2); 
		assertNotNull(testSquare); 
	}
	
	@Test
	public void testPerimeter() {
		Point topLeft = new Point(0,0); 
		Square testSquare = new Square(topLeft, 2); 
		assertEquals(testSquare.perimeter(), 8, 0.00001); 
	}
	
	@Test
	public void testMoveSquareX() {
		Point topLeft = new Point(0,0); 
		Square testSquare = new Square(topLeft, 2); 
		testSquare.moveSquare(1, 0);
		assertEquals(testSquare.topLeft.x, 1, 0.00001); 
	}
	
	@Test
	public void testMoveSquareY() {
		Point topLeft = new Point(0,0); 
		Square testSquare = new Square(topLeft, 2); 
		testSquare.moveSquare(0, 1);
		assertEquals(testSquare.topLeft.y, 1, 0.00001); 
	}

}
