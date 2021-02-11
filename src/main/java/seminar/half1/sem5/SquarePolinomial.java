package seminar.half1.sem5;

public class SquarePolinomial extends Polynomial {
    public SquarePolinomial(double a, double b, double c) throws BadSquarePolinomial {
        super(c, b, a);
        if (getDegree() < 2) {
            throw new BadSquarePolinomial("Старший коэффицент жолжен быть не 0");
        }
    }

    public SquarePolinomial(String str) throws BadSquarePolinomial {
        super(str);
        if (getDegree() != 2) {
            throw new BadSquarePolinomial("Старший коэффицент жолжен быть не 0");
        }
    }

    public double getA() {
        return getCoeff(2);
    }

    public double getB() {
        return getCoeff(1);
    }

    public double getC() {
        return getCoeff(0);
    }

    public double getDiscriminant() {
        return getB() * getB() - 4 * getA() * getC();
    }

    public double[] getRoots() {
        double d = getDiscriminant();

        if (Double.compare(d, 0.0) < 0) {
            return new double[0];
        }
        if (Double.compare(d, 0.0) == 0) {
            return new double[]{-getB() / (2.0 * getA())};
        }
        return new double[]{
                (-getB() - Math.sqrt(d)) / (2.0 * getA()),
                (-getB() + Math.sqrt(d)) / (2.0 * getA())
        };
    }

    public Polynomial[] split() throws NoRootsException {
        double[] roots = getRoots();
        if (roots.length == 0) {
            throw new NoRootsException("Нельзя разложить многочлен без корней");
        }
        if (roots.length == 1) {
            return new Polynomial[]{
                    new Polynomial(getA()),
                    new Polynomial(-roots[0], 1),
                    new Polynomial(-roots[0], 1)
            };
        }
        return new Polynomial[]{
                new Polynomial(getA()),
                new Polynomial(-roots[0], 1),
                new Polynomial(-roots[1], 1)
        };
    }
}
