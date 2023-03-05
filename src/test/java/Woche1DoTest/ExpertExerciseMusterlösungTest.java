import Woche1DoTest.ExpertExerciseMusterlösung;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpertExerciseMusterlösungTest {

    @Test
    void reverse() {
        assertEquals("cba", ExpertExerciseMusterlösung.reverse("abc"));
    }

    @Test
    void sortArray() {
        assertArrayEquals(new int[]{2, 3, 6, 6, 8, 9}, ExpertExerciseMusterlösung.sortArray());
    }

    @Test
    void splitStringOnComma() {
        assertArrayEquals(new String[]{"Hallo", " Welt"}, ExpertExerciseMusterlösung.splitStringOnComma("Hallo, Welt"));
    }

    @Test
    void decimalToRoman_when1985() {
        assertEquals("MCMLXXXV", ExpertExerciseMusterlösung.decimalToRoman(1985));
    }

    @Test
    void decimalToRoman_when1() {
        assertEquals("I", ExpertExerciseMusterlösung.decimalToRoman(1));
    }


    @Test
    void checkSum_789() {
        assertEquals(24, ExpertExerciseMusterlösung.checkSum(789));
    }

    @Test
    void checkSum_0() {
        assertEquals(0, ExpertExerciseMusterlösung.checkSum(0));
    }

    @Test
    void checkSum_1() {
        assertEquals(1, ExpertExerciseMusterlösung.checkSum(1));
    }

    @Test
    void checkSum_negativeNumbers() {
        assertEquals(-6, ExpertExerciseMusterlösung.checkSum(-123));
    }
}