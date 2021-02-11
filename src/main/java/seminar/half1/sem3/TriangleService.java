package seminar.half1.sem3;

import seminar.half1.sem2.Point2D;
import seminar.half1.sem2.Triangle;


//Тест в начале семинара
public class TriangleService {
    //    По массиву треугольников найти их суммарную площадь
    public static double getSumSquare(Triangle[] triangles) {
        double sum = 0;
        for (Triangle t : triangles) {
            sum += t.getSquare();
        }
        return sum;
    }

    //    По массиву треугольников найти количество треугольников максимальной площади
    public static int countOfTriangleWithMaxArea(Triangle[] triangles) {
        int counter = 0;
        double maxSquare = 0.0;
        for (Triangle t : triangles) {
            double square = t.getSquare();
            if (Double.compare(maxSquare, t.getSquare()) == 0) {
                counter++;
            }
            if (Double.compare(maxSquare, t.getSquare()) < 0) {
                maxSquare = t.getSquare();
                counter = 1;
            }
        }
        return counter;
    }

    //    По массиву треугольников и точке найти количество треуголников, содержащх эту точку внутри
    public static int getTrianglesWithPoint(Triangle[] triangles, Point2D point) {
        int counter = 0;
        try {
            for (Triangle t : triangles) {
                double square1 = (new Triangle(t.getA(), t.getB(), point)).getSquare();
                double square2 = (new Triangle(t.getB(), t.getC(), point)).getSquare();
                double square3 = (new Triangle(t.getC(), t.getA(), point)).getSquare();
                double square = t.getSquare();
                if (Double.compare(square, square1 + square2 + square3) == 0) {
                    ++counter;
                }
            }
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        return counter;
    }
}
