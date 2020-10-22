package seminar.d3;

import seminar.d2.Point2D;
import seminar.d2.Triangle;


//Тест в начале семинара
public class TriangleService {
    public static double getSumSquare(Triangle[] triangles) {
        double sum = 0;
        for (Triangle t : triangles) {
            sum += t.getSquare();
        }
        return sum;
    }

    public static int countOfTriangleWithMaxArea(Triangle[] triangles) {
        int counter = 0;
        double maxValue = 0.0;
        for (Triangle item : triangles) {
            if (Double.compare(maxValue, item.getSquare()) == 0) {
                counter++;
            }
            if (Double.compare(maxValue, item.getSquare()) < 0) {
                maxValue = item.getSquare();
                counter = 1;
            }
        }
        return counter;
    }



    public static int getTrianglesWithPointCount(Triangle[] triangles, Point2D point) {
//            (x1 - x0) * (y2 - y1) - (x2 - x1) * (y1 - y0)
//            (x2 - x0) * (y3 - y2) - (x3 - x2) * (y2 - y0)
//            (x3 - x0) * (y1 - y3) - (x1 - x3) * (y3 - y0)
        int counter = 0;
        for (Triangle item : triangles) {

        }
        return 1;
    }
}
