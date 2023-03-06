package Woche1DoTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoviceAufgabenTest {

    @Test
    void myNameTest() {
        assertEquals("Mein Name ist Robin", NoviceAufgaben.myName());
        //bei Equals wird ein wert erwartet String oder integer
    }

    @Test
    void checkNumberBiggerThenZeroTest_ShouldBeTrue() {
        //GIVEN
        int value = 1;
        //WHEN
        boolean result = NoviceAufgaben.checkNumberBiggerThenZero(value);
        //THEN
        assertTrue(result);
        //hier ist es ein boolean deswegen assertTrue da True erwartet wird
    }
    @Test
    void checkNumberBiggerThenZeroTest_ShouldBeFalse() {
        //GIVEN
        int value = 0;
        //WHEN
        boolean result = NoviceAufgaben.checkNumberBiggerThenZero(value);
        //THEN
        assertFalse(result);
        //assertFalse(NoviceAufgaben.checkNumberBiggerThenZero(0));
        //hier ist es wie oben ein boolean allerdings test mit 0 deswegen wird False erwartet also assertFalse
    }

    @Test
    void checkNumberBiggerThenZeroTest_ShouldbeFalse() {
        assertFalse(NoviceAufgaben.checkNumberBiggerThenZero(-1));
        //hier wie oben False wird erwartet da wert(zahl) negativ ist mit -1
    }

    @Test
    void squareOfNumberTest() {
        assertEquals(25, NoviceAufgaben.squareOfNumber(5));
    }
}