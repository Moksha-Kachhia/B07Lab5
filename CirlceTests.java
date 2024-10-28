
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

class CircleTests{
    @Test
    void testCircleConstructor{
        Point p = new Point(1.0,1.0);
        Circle c = new Circle(p, 1.0);

        assertEquals(c.center = p);
        assertEquals(c.radius = 1.0);
    }

    @Test
    void testAreaZero{

    }

    @Test
    void testAreaNegative{

    }

    @Test
    void testAreaPositive{

    }

    @Test
    void testMoveSamePoint{

    }

    @Test
    void testMovejustX{

    }

    @Test
    void testMovejustY{

    }

    @Test
    void testMoveXandY{

    }


}