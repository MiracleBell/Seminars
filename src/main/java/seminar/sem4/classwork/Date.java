package seminar.sem4.classwork;
//Констурктор по трем числам
//Конструктор по строке вида dd.mm.yy
//Проверка года на високосность
//Метод compareTo

public class Date {
    private int day;
    private int month;
    private int year;
    private static int[] dayInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int[] daysLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int day, int month, int year) {
        isDateCorrect(day, month, year);
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(String date) {
        String[] elems = date.split("\\.");
        if (elems.length != 3) {
            throw new IllegalArgumentException("Incorrect date");
        }

        day = Integer.parseInt(elems[0]);
        month = Integer.parseInt(elems[1]);
        year = Integer.parseInt(elems[2]);
        isDateCorrect(day, month, year);
    }

    public boolean isDateCorrect(int day, int month, int year) {
        if (day < 1 || month < 1 || year < 1 || month > 12 || dayInMonth[month - 1] < day) {
            if (!isLeapYear(year) && day > dayInMonth[month - 1] || isLeapYear(year) && day > daysLeapYear[month - 1]) {
                throw new IllegalArgumentException("Некорректная дата");
            }
        }
        return true;
    }

    public boolean isLeapYear(int year) {
        if (year % 4 != 0 || year % 4 == 0 && year % 100 == 0) {
            return false;
        }
        return true;
    }

    public int compareTo(Date otherDate) {
        int diff = this.year - otherDate.year;
        if (diff != 0) {
            return diff;
        }
        diff = this.month - otherDate.month;
        if (diff != 0) {
            return diff;
        }
        return this.day - otherDate.month;
    }

}
