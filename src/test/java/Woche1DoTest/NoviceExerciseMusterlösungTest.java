import Woche1DoTest.NoviceExerciseMusterlösung;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoviceExerciseTest {

    @Test
    void getName_shouldReturnName() {
        assertEquals("Max Power", NoviceExerciseMusterlösung.getName());
    }

    @Test
    void isBiggerThanZero_whenZero_shouldReturnFalse() {
        assertFalse(NoviceExerciseMusterlösung.isBiggerThanZero(0));
    }

    @Test
    void isBiggerThanZero_whenOne_shouldReturnTrue() {
        assertTrue(NoviceExerciseMusterlösung.isBiggerThanZero(1));
    }

    @Test
    void isBiggerThanZero_whenMinusOne_shouldReturnFalse() {
        assertFalse(NoviceExerciseMusterlösung.isBiggerThanZero(-1));
    }

    @Test
    void calculateSquare_whenTwo_shouldReturnFour() {
        assertEquals(4, NoviceExerciseMusterlösung.calculateSquare(2));
    }

    @Test
    void calculateSquare_whenZero_shouldReturnZero() {
        assertEquals(0, NoviceExerciseMusterlösung.calculateSquare(0));
    }

    @Test
    void calculateSquare_whenMinusOne_shouldReturnOne() {
        assertEquals(1, NoviceExerciseMusterlösung.calculateSquare(-1));
    }
}