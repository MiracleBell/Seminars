package seminar.d3;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

import seminar.d2.Point2D;
import seminar.d2.Triangle;

public class TestTriangleService {
    public final static double EPSILON = 1E-6;

    @Ignore
    public void testSquare() throws Exception {
        Triangle[] triangles = {
                new Triangle(
                        new Point2D(0, 0), new Point2D(3, 0), new Point2D(0, 4)
                ),
                new Triangle(
                        new Point2D(0, 0), new Point2D(10, 0), new Point2D(0, 6)
                ),
                new Triangle(
                        new Point2D(0, 0), new Point2D(1, 0), new Point2D(0, 1)
                )
        };
        double sum = TriangleService.getSumSquare(triangles);
        assertEquals(6, sum, EPSILON);
    }

    @Test
    public void testGetSumSquares() throws Exception {
        Triangle[] triangles = {
                new Triangle(
                        new Point2D(0, 0), new Point2D(3, 0), new Point2D(0, 4)
                ),
                new Triangle(
                        new Point2D(0, 0), new Point2D(10, 0), new Point2D(0, 6)
                ),
                new Triangle(
                        new Point2D(0, 0), new Point2D(1, 0), new Point2D(0, 1)
                )
        };
        double sum = TriangleService.getSumSquare(triangles);
        assertEquals(36.5, sum, EPSILON);
    }

    @Test
    public void testGetCount() throws Exception {
        Triangle[] triangles = {
                new Triangle(new Point2D(0, 0), new Point2D(3, 0), new Point2D(0, 4)),
                new Triangle(new Point2D(0, 0), new Point2D(10, 0), new Point2D(0, 6)),
                new Triangle(new Point2D(0, 0), new Point2D(1, 0), new Point2D(0, 1)),
                new Triangle(new Point2D(0, 0), new Point2D(10, 0), new Point2D(0, 6))
        };
        int count = TriangleService.countOfTriangleWithMaxArea(triangles);
        assertEquals(2, count);
    }

    @Test
    public void testPointBelonging() throws Exception {
        Triangle[] triangles = {
                new Triangle(new Point2D(0, 0), new Point2D(3, 0), new Point2D(0, 4)),
                new Triangle(new Point2D(0, 0), new Point2D(10, 0), new Point2D(0, 6)),
                new Triangle(new Point2D(0, 0), new Point2D(1, 0), new Point2D(0, 1)),
                new Triangle(new Point2D(0, 0), new Point2D(10, 0), new Point2D(0, 6))
        };
        int count = TriangleService.getTrianglesWithPointCount(triangles, new Point2D(1, 0));
        assertEquals(0, count);
    }
}
