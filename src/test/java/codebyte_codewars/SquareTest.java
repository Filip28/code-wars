package codebyte_codewars;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    private final Square square = new Square();

    @ParameterizedTest
    @ValueSource(ints = {-1, 8, 26, 6178200})
    void shouldReturnFalseOnNonSquareNumber(int number){
        // given + when
        boolean result = this.square.isSquare(number);

        // then
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueOnSquareNumber(){
        // given
        int number = 25;

        // when
        boolean result = this.square.isSquare(number);

        // then
        assertTrue(result);
    }

}