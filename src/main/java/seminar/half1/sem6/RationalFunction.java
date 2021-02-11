package seminar.half1.sem6;

import seminar.half1.sem5.Polynomial;

import java.util.Objects;

public class RationalFunction implements IDerivable {
    private Polynomial up;
    private Polynomial down;

    public RationalFunction(Polynomial up, Polynomial down) throws ZeroDenominatorException {
        if (down.getDegree() == 0 && down.getCoeff(0) == 0) {
            throw new ZeroDenominatorException("Cannot create function");
        }
        this.up = up;
        this.down = down;
    }

    public RationalFunction() {
        this.up = new Polynomial(0.0);
        this.down = new Polynomial(1.0);
    }

    public Polynomial getUp() {
        return up;
    }

    public Polynomial getDown() {
        return down;
    }

    // (f/g)'=(f'g-fg')g^2
    @Override
    public IFunction derive() {
        try {
            return new RationalFunction(
                    PolynomialArithmetic.sub(
                            PolynomialArithmetic.mul(up.derive(), down),
                            PolynomialArithmetic.mul(up, down.derive())
                    ),
                    PolynomialArithmetic.mul(down, down)
            );
        } catch (ZeroDenominatorException ex) {
//            supress the exception
        }
        return null;
    }

    @Override
    public boolean inDomain(double x) {
        return Double.compare(0.0, down.getValue(x)) != 0;
    }

    @Override
    public double getValue(double x) throws BadFunctionArgException {
        if (!inDomain(x)) {
            throw new BadFunctionArgException("Denominator is zero");
        }
        return up.getValue(x) / down.getValue(x);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RationalFunction that = (RationalFunction) o;
        return Objects.equals(up, that.up) &&
                Objects.equals(down, that.down);
    }

    @Override
    public int hashCode() {
        return Objects.hash(up, down);
    }
}
