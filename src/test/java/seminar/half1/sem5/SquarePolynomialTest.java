package seminar.half1.sem5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquarePolynomialTest {
    private static final double ACC = 0.001;

    @Test
    public void testCreate() throws BadSquarePolinomial {
        SquarePolinomial sp = new SquarePolinomial(1, 2, 3);
        assertEquals(2, sp.getDegree());
        assertEquals(1.0, sp.getA(), ACC);
        assertEquals(2.0, sp.getB(), ACC);
        assertEquals(3.0, sp.getC(), ACC);
    }

    @Test(expected = BadSquarePolinomial.class)
    public void testCreateByCoeffsTooLowDegree() throws BadSquarePolinomial {
        SquarePolinomial sp = new SquarePolinomial(0, 2, 3);
    }

    @Test
    public void testGetDiscriminant() throws BadSquarePolinomial {
        SquarePolinomial sp = new SquarePolinomial(1, 2, 3);
        assertEquals(0, sp.getDegree(), ACC);
    }

    @Test
    public void testGetRootsNoRoots() throws BadSquarePolinomial {
        SquarePolinomial sp = new SquarePolinomial(1, 2, 3);
        double[] expected = new double[0];
        assertArrayEquals(expected, sp.getRoots(), ACC);
    }

    @Test
    public void testGetRootsOneRoot() throws BadSquarePolinomial {
        SquarePolinomial sp = new SquarePolinomial(4, -4, 1);
        double[] expected = new double[]{0.5};
        assertArrayEquals(expected, sp.getRoots(), ACC);
    }

    @Test
    public void testGetRootsTwoRoots() throws BadSquarePolinomial {
        SquarePolinomial sp = new SquarePolinomial(1, -5, 6);
        double[] expected = new double[]{0.5};
        assertArrayEquals(expected, sp.getRoots(), ACC);
    }

    @Test
    public void testSplitWithTwoRoots() throws BadSquarePolinomial {
        SquarePolinomial sp = new SquarePolinomial(1, -5, 6);
        Polynomial[] expected = new Polynomial[]{
                new Polynomial(1.0),
                new Polynomial(-2.0, 1.0),
                new Polynomial(-3.0, 1.0)
        };
//        assertArrayEquals(expected, sp.getRoots(), ACC);
    }


}
