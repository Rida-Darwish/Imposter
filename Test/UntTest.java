import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UntTest {

    @Test
    public void testAdd(){
        assertEquals(5, Calculation.addition(3,2));
    }

    @Test
    public void testSubtract(){
        assertEquals(1, Calculation.subtact(3,2));
    }

    @Test
    public void testMultiply(){
        assertEquals(6, Calculation.multiply(3,2));
    }

    @Test
    public void testDivide(){
        assertEquals(3, Calculation.divide(6,2));
    }

}
