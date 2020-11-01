package codebyte_codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakeBinaryTest {

    private final FakeBinary fakeBinary = new FakeBinary();

    @Test
    void shouldReplaceNumbersBelowFiveWithZero() {
        // given
        String str = "01234";

        // when
        String result = fakeBinary.fakeBin(str);

        // then
        assertEquals("00000", result);
    }

    @Test
    void shouldReplaceNumbersAboveFiveWithOne() {
        // given
        String str = "56789";

        // when
        String result = fakeBinary.fakeBin(str);

        // then
        assertEquals("11111", result);
    }
}