package seminar.half2.sem2.task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestData {
    private static final double EPS = 1E-5;

    @Test
    public void testConstructor1() {
        String name = "Good";
        double value = 122;
        Data data = new Data(name, value);

        assertEquals(data.getName(), name);
        assertEquals(data.getValue(), value, EPS);
    }

    @Test
    public void testConstructor2() {
        String name = "Good";
        double value = -1223.123;
        Data data = new Data(name, value);

        assertEquals(data.getName(), name);
        assertEquals(data.getValue(), value, EPS);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor3() {
        String name = null;
        int value = 122;
        Data data = new Data(name, value);
    }

    @Test
    public void testSetters1() {
        String name = "Good";
        double value = 122;
        Data data = new Data(name, value);

        String newName = "Better";
        double newValue = 9999;

        data.setName(newName);
        data.setValue(newValue);

        assertEquals(data.getName(), newName);
        assertEquals(data.getValue(), newValue, EPS);
    }

    @Test
    public void testSetters2() {
        String name = "Good";
        double value = 122;
        Data data = new Data(name, value);

        String newName = "Gooooood";
        double newValue = -122;

        data.setName(newName);
        data.setValue(newValue);

        assertEquals(data.getName(), newName);
        assertEquals(data.getValue(), newValue, EPS);
    }

    @Test(expected = NullPointerException.class)
    public void testSetters3() {
        String name = "Good";
        double value = 122;
        Data data = new Data(name, value);

        String newName = "";
        data.setName(newName);
    }

    @Test(expected = NullPointerException.class)
    public void testSetters4() {
        String name = "Good";
        double value = 122;
        Data data = new Data(name, value);

        String newName = null;

        data.setName(newName);
    }

}
