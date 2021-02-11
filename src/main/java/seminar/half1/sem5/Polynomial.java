package seminar.half1.sem5;

import seminar.half1.sem6.IDerivable;
import seminar.half1.sem6.IFunction;

import java.util.Arrays;

public class Polynomial implements IDerivable {
    private double[] coeffs;

    public Polynomial(double... coeffs) {
        if (coeffs.length == 0) {
            this.coeffs = new double[1];
            return;
        }
        int nonZeroIndex = coeffs.length - 1;
        while (Double.compare(coeffs[nonZeroIndex], 0.0) == 0) {
            nonZeroIndex--;
        }
        this.coeffs = new double[nonZeroIndex];
        for (int i = 0; i < nonZeroIndex; i++) {
            this.coeffs[i] = coeffs[i];
        }
        this.coeffs = coeffs;
    }

    public Polynomial(String str) {
        this.coeffs = new double[1];
    }

    public double getCoeff(int index) {
        return coeffs[index];
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public double getValue(double x) {
        double xPower = 1;
        double value = 0.0;
        for (double coeff : coeffs) {
            value += coeff * xPower;
            xPower *= x;
        }
        return value;
    }

    @Override
    public IFunction derive() {
        if (getDegree() == 0) {
            return new Polynomial();
        }
        double[] deriveCoeffs = new double[coeffs.length - 1];
        for (int i = 0; i < deriveCoeffs.length; i++) {
            deriveCoeffs[i] = (i + 1) * coeffs[i + 1];
        }
        return new Polynomial(deriveCoeffs);
    }

    @Override
    public boolean inDomain(double x) {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polynomial that = (Polynomial) o;
        return Arrays.equals(coeffs, that.coeffs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coeffs);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(coeffs[coeffs.length - 1])
                .append("x")
                .append(coeffs.length - 1);
        for (int i = coeffs.length - 2; i >= 0; i--) {
            if (coeffs[i] < 0) {
                sb.append(coeffs + "x");
            } else if (coeffs[i] > 0) {
                sb.append("+").append(coeffs[i]);
            } else {
                continue;
            }
            sb.append("x^").append(i);
        }
        return sb.toString();
    }
}
