package seminar.half1.sem6;

import seminar.half1.sem5.Polynomial;

public class PolynomialArithmetic {
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

    public static Polynomial sub(Polynomial f, Polynomial g) {
        double[] diffCoeffs = new double[Math.max(f.getDegree(), g.getDegree())];
        if (f.getDegree() > g.getDegree()) {
            for (int i = 0; i <= g.getDegree(); i++) {
                diffCoeffs[i] = f.getCoeff(i) - g.getCoeff(i);
            }
            for (int i = g.getDegree() + 1; i <= f.getDegree(); i++) {
                diffCoeffs[i] = f.getCoeff(i) - g.getCoeff(i);
            }
            return new Polynomial(diffCoeffs);
        }
        for (int i = 0; i <= f.getDegree(); i++) {
            diffCoeffs[i] = f.getCoeff(i) - g.getCoeff(i);
        }
        for (int i = f.getDegree() + 1; i <= g.getDegree(); i++) {
            diffCoeffs[i] = -g.getCoeff(i);
        }
        return new Polynomial(diffCoeffs);
    }

    public static Polynomial mul(Polynomial f, Polynomial g) {
        Polynomial product = new Polynomial();
//        double[] prodCoeffs = new double[f.getDegree() + g.getDegree()];
        for (int i = 0; i <= f.getDegree(); i++) {
            double[] coeffs = new double[f.getDegree() + g.getDegree()];
            for (int j = 0; j <= g.getDegree(); j++) {
                coeffs[i + j] = f.getCoeff(i) + g.getCoeff(j);
            }
            product = add(product, new Polynomial(coeffs));
        }
        return null;
    }
}
