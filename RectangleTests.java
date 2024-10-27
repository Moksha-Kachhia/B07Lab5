package Test;

import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import src.Point;
import src.Rectangle;

public class RectangleTests {
	

	@Test
    public void testPerimeter2() {
       
        
        Rectangle R = new Rectangle();
        
        assertNotNull(R);
    } 
	
	@Test
	public void testPerimeter() {
        Point A = new Point(0, 0);
        Point B = new Point(3, 0);
        Point C = new Point(3, 4); 
        Point D = new Point(0, 4); 
        
        Rectangle R = new Rectangle(A, B, C, D);
        assertEquals(14, R.perimeter(), 0.001); 
    }

    @Test
    public void testPerimeter1() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 0);
        Point C = new Point(0, 0);
        Point D = new Point(0, 0);

        Rectangle R = new Rectangle(A, B, C, D);
        assertEquals(0, R.perimeter(), 0.001);
    }

    @Test
    public void testArea1() {
        Point A = new Point(0, 0);
        Point B = new Point(3, 0);
        Point C = new Point(3, 4);
        Point D = new Point(0, 4);

        Rectangle R = new Rectangle(A, B, C, D);
        assertEquals(12, R.area(), 0.001); 
    }

    @Test
    public void testArea4() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 0);
        Point C = new Point(0, 0);
        Point D = new Point(0, 0);

        Rectangle R = new Rectangle(A, B, C, D);
        assertEquals(0, R.area(), 0.001);
    }
	@Test
    public void testArea() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 0);
        Point C = new Point(0, 0);
        Point D = new Point(0, 0);
        
        Rectangle R = new Rectangle(A, B, C, D);
        
        assertEquals(0, R.area(), 0.001);
    }
}
