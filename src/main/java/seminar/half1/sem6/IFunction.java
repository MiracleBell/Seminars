package seminar.half1.sem6;

public interface IFunction {
    default boolean inDomain(double x) {
        return true;
    }

    double getValue(double x)throws BadFunctionArgException;
}
