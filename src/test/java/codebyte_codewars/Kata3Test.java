package codebyte_codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata3Test {

    private final Kata3 kata = new Kata3();

    @Test
    void shouldReturnPhoneNumber() {
        // given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        // when
        String result = kata.createPhoneNumber(numbers);

        // then
        assertEquals("(123) 456-7890", result);
    }

}