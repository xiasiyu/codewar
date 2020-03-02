package codewar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class FindOddIntTest {

    @Test
    public void shouldFindOdd() {
        int[] arrays = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};

        int it = FindOddInt.findIt(arrays);
        assertEquals(it, 5);
    }

    @Test
    public void shouldMin() {
        int[] arrays = {2, 3, 5, 5, 1, 9, 3, 5};

        int min = FindOddInt.minValue(arrays);

        assertEquals(min, 12359);
    }

}
