package seminar.half1.sem2;

import java.util.Objects;

public class Triangle {
    private Point2D a;
    private Point2D b;
    private Point2D c;
    private double vx;
    private double vy;
    private double ux;
    private double uy;
    private double kx;
    private double ky;


    public Triangle(Point2D a, Point2D b, Point2D c) throws NullPointerException {
        if (a == null || b == null || c == null) {
            throw new NullPointerException("Переданная точка ссылается на null");
        }
        this.vx = a.getX() - b.getX();
        this.vy = a.getY() - b.getY();
        this.ux = b.getX() - c.getX();
        this.uy = b.getY() - c.getY();
        this.kx = c.getX() - a.getX();
        this.ky = c.getY() - a.getY();

        if (Double.compare(vx * ux, vy * uy) == 0) {
            throw new IllegalArgumentException("По данным точкам невозможно построить треугольник, т.к. точки лижат на одной прямой");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point2D getA() {
        return a;
    }

    public Point2D getB() {
        return b;
    }

    public Point2D getC() {
        return c;
    }

    public double lengthAB() {
        return a.getDistance(b);
    }

    public double lengthBC() {
        return b.getDistance(c);
    }

    public double lengthAC() {
        return c.getDistance(a);
    }

    public double getSquare() {
        return Math.abs(ux * vy - uy * vx);
    }

    public boolean isRectangular() {
        return (vx * ux + vy * uy == 0 ||
                ux * kx + uy * ky == 0 ||
                kx * vx + ky * vy == 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.vx, vx) == 0 &&
                Double.compare(triangle.vy, vy) == 0 &&
                Double.compare(triangle.ux, ux) == 0 &&
                Double.compare(triangle.uy, uy) == 0 &&
                Double.compare(triangle.kx, kx) == 0 &&
                Double.compare(triangle.ky, ky) == 0 &&
                Objects.equals(a, triangle.a) &&
                Objects.equals(b, triangle.b) &&
                Objects.equals(c, triangle.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, vx, vy, ux, uy, kx, ky);
    }
}
