package seminar.d3;

import seminar.d2.Triangle;


public class StringService {
    /*Вход массив строк
     * @param strings массив строк
     * @param ch символ
     * @return количество строк, которые начинаются на ch
     * */
    public static int getCountByStartChar(String[] strings, char ch) {
        int count = 0;
        for (String s : strings) {
            if (!"".equals(s) && s.charAt(0) == ch) {
                ++count;
            }
        }
        return count;
    }

    /* Посчитать количество слов в строке
     * @param str - произвольная строка
     * @return count - количество слов в строке
     * */
    public static int getWordsCount(String str) {
        int count = 0;
        String[] items = str.split(" ");
        for (String item : items) {
            if (!"".equals(item)) {
                count++;
            }
        }
        return count;
    }


    /* Вывести массив треугольников в текстовом формате
     * @param triangles - массив треугольников
     * @return strings - массив строк содержащий точки каждого тереугольника
     * */
    public static String[] getFormattedTriangleArray(Triangle[] triangles) {
        String[] strings = new String[triangles.length];
        int i = 0;
        for (Triangle t : triangles) {
            strings[i++] = String.format(
                    "A(%f,%f), B(%f,%f), C(%f,%f),",
                    t.getA().getX(), t.getA().getY(),
                    t.getB().getX(), t.getB().getY(),
                    t.getC().getX(), t.getC().getY()
            );
        }
        return strings;
    }
}
