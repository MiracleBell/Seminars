package seminar.d3;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestStringService {
    @Test
    public void testWordCount()throws Exception{
        String input="qwe rty asd";
        assertEquals(3, StringService.getWordsCount(input));
    }
}
