package seminar.half1.sem6;

import org.junit.Test;
import seminar.half1.sem5.Polynomial;

import static org.junit.Assert.assertEquals;

public class PolynomialArithmeticTest {
    @Test
    public void testAddBigDegreeToLowDegree() {
        Polynomial f = new Polynomial(1, 2, 3);
        Polynomial g = new Polynomial(2, 1);
        Polynomial expected=new Polynomial(3,3,3);
        Polynomial actual = PolynomialArithmetic.add(f, g);
        assertEquals(expected,actual);
    }

    @Test
    public void testAddLowDegreeToBigDegree() {
        Polynomial f = new Polynomial(1, 2, 3);
        Polynomial g = new Polynomial(2, 1);
        Polynomial expected=new Polynomial(3,3,3);
        Polynomial actual = PolynomialArithmetic.add(f, g);
        assertEquals(expected,actual);
    }

    @Test
    public void testAddWithZeroLeadingCoeffsInSum() {
        Polynomial f = new Polynomial(1, 2, 3);
        Polynomial g = new Polynomial(2, -2,-3);
        Polynomial expected=new Polynomial(3,3,3);
        Polynomial actual = PolynomialArithmetic.add(g, f);
        assertEquals(expected,actual);
    }
}
