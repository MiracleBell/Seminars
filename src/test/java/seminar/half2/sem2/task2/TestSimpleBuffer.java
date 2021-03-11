package seminar.half2.sem2.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSimpleBuffer {

    @Test
    public void testConstructor1() {
        SimpleBuffer<Integer> buffer = new SimpleBuffer<>();
//        assertEquals();
    }

    @Test
    public void testAddElementInBuffer() {
        SimpleBuffer<Integer> buffer = new SimpleBuffer<>();

        buffer.addElementInBuffer(99);
        buffer.addElementInBuffer(515);
    }

    @Test(expected = NullPointerException.class)
    public void testAddElementInBuffer2() {
        SimpleBuffer<Integer> buffer = new SimpleBuffer<>();

        buffer.addElementInBuffer(null);
    }

    @Test
    public void testElementsInBuffer1() {
        SimpleBuffer<Integer> buffer = new SimpleBuffer<>();

        buffer.addElementInBuffer(99);
        buffer.addElementInBuffer(515);

        int size = 2;
        assertEquals(size, buffer.elementsInBuffer());
    }

    @Test
    public void testElementsInBuffer2() {
        SimpleBuffer<Integer> buffer = new SimpleBuffer<>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            buffer.addElementInBuffer(i);
        }

        assertEquals(size, buffer.elementsInBuffer());
    }


    @Test
    public void testPopElementFromBuffer1() {
        SimpleBuffer<Integer> buffer = new SimpleBuffer<>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            buffer.addElementInBuffer(i);
        }
        buffer.popElementFromBuffer();
        --size;
        assertEquals(size, buffer.elementsInBuffer());
    }

    @Test
    public void testPopElementFromBuffer2() {
        SimpleBuffer<Integer> buffer = new SimpleBuffer<>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            buffer.addElementInBuffer(i);
        }
        for (int i = 0; i < size; i++) {
            buffer.popElementFromBuffer();
        }
        size = 0;
        assertEquals(size, buffer.elementsInBuffer());
    }

    @Test(expected = NullPointerException.class)
    public void testPopElementFromBuffer3() {
        SimpleBuffer<Integer> buffer = new SimpleBuffer<>();
        buffer.popElementFromBuffer();
    }

    @Test(expected = NullPointerException.class)
    public void testPopElementFromBuffer4() {
        SimpleBuffer<Integer> buffer = new SimpleBuffer<>();
        int size = 10;
        for (int i = 0; i < size; i++) {

        }
        buffer.popElementFromBuffer();
    }
}
