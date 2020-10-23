package seminar.sem3;

import seminar.sem2.Triangle;


public class StringService {

//    Преобразовать строку вида "Фамилия Имя Отчество" в строку "Фамилия И.О."
    public static String getShortName(String surname, String name, String middleName) {
        return String.format("%s %c.%c.", surname, name.charAt(0), middleName.charAt(0));
    }


//    Удалить из строки все вхождения переданного символа
    public static String removeAllCurrentSymbols(String string, char character) {
        return string.replaceAll(character + "", "");
    }

//    Переставить слова в строке местами
    public static String reverse(String string) {
        String[] words = string.split(" ");
        String supportValue;
        for (int i = 0; i < words.length / 2; i++) {
            supportValue = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = supportValue;
        }
        return String.join(" ", words);
    }


//    Посчитать количество строк, начинающихся на заданный символ
    public static int getCountByStartChar(String[] strings, char ch) {
        int count = 0;
        for (String s : strings) {
            if (!"".equals(s) && s.charAt(0) == ch) {
                ++count;
            }
        }
        return count;
    }

//    Посчитать количество слов в строке
    public static int getWordsCount(String str) {
        int count = 0;
        for (String item : str.split(" ")) {
            if (!"".equals(item)) {
                ++count;
            }
        }
        return count;
    }


//    Вывести массив треугольников в текстовом формате
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
