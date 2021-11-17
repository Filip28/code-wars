package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindOutlierTest {

    private final FindOutlier findOutlier = new FindOutlier();

    @Test
    void shouldReturnOddNumber() {
        // given
        int[] arr = new int[]{2, 4, 0, 100, 4, 11, 2602, 36};

        // when
        int result = findOutlier.find(arr);

        // then
        assertEquals(11, result);
    }

    @Test
    void shouldReturnEvenNumber() {
        // given
        int[] arr = new int[]{160, 3, 1719, 19, 11, 13, -21};

        // when
        int result = findOutlier.find(arr);

        // then
        assertEquals(160, result);
    }
}