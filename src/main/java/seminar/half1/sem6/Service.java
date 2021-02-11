package seminar.half1.sem6;

import seminar.half1.sem5.Polynomial;

public class Service {
    public static double[] getAllValues(Polynomial[] polynomials, double x) {
        double[] values = new double[polynomials.length];
        for (int i = 0; i < polynomials.length; i++) {
            values[i] = polynomials[i].getValue(x);
        }
        return values;
    }

    public static Polynomial add(Polynomial f, Polynomial g) {
        Polynomial minPoly = f;
        Polynomial maxPoly = g;
        if (f.getDegree() > g.getDegree()) {
            minPoly = g;
            maxPoly = f;
        }
        double[] sumCoeffs = new double[maxPoly.getDegree() + 1];
        for (int i = 0; i <= minPoly.getDegree(); i++) {
            sumCoeffs[i] = minPoly.getCoeff(i) + maxPoly.getCoeff(i);
        }
        for (int i = minPoly.getDegree() + 1; i <= maxPoly.getDegree(); i++) {
            sumCoeffs[i] = maxPoly.getCoeff(i);
        }
        return new Polynomial(sumCoeffs);
    }
}
