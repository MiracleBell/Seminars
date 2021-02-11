package seminar.half1.sem5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestPolynomial {
    private static final double ACC = 0.0001;

    @Test
    public void testCreateWithoutCoeffs() {
        Polynomial p = new Polynomial();
        assertEquals(0.0, p.getCoeff(0), ACC);
        assertEquals(0, p.getDegree());
    }

    @Test
    public void testCreateDegree1() {
        Polynomial p = new Polynomial(1, 2);
        assertEquals(1.0, p.getCoeff(0), ACC);
        assertEquals(2.0, p.getCoeff(1), ACC);
        assertEquals(1, p.getDegree());
    }

    @Test
    public void testCreateDegree2() {
        Polynomial p = new Polynomial(1, 2, 0);
        assertEquals(1.0, p.getCoeff(0), ACC);
        assertEquals(2.0, p.getCoeff(1), ACC);
        assertEquals(1, p.getDegree());
    }

    @Test
    public void testGetValue() {
        Polynomial p = new Polynomial(1, 2);
        assertEquals(3.0, p.getValue(1), ACC);
    }

    @Test
    public void testDeriveNonConstant() {
        Polynomial p = new Polynomial(1, 2, 3);
        Polynomial derivation = new Polynomial(2, 6);
        Polynomial actual = p.derive();
        assertEquals(actual, derivation);
    }

    @Test
    public void testDeriveConstant() {
        Polynomial p = new Polynomial(1);
        Polynomial derivation = new Polynomial(0);
        Polynomial actual = p.derive();
        assertEquals(actual, derivation);
    }

    @Test
    public void testToString() {
        Polynomial p = new Polynomial(-1, 2, -3);
        String actual = p.toString();
        assertEquals("-3.0x^2 + 2x ", actual);
    }
}
