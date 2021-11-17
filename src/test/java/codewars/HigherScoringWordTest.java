package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HigherScoringWordTest {

    HigherScoringWord higherScoringWord = new HigherScoringWord();

    @Test
    void shouldReturnWordWithHighestScore() {
        // given
        String stringOfWords = "what time are we climbing up to the volcano";

        // when
        String result = higherScoringWord.countScore(stringOfWords);

        // then
        assertEquals("volcano", result);
    }

}