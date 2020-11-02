package codebyte_codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalPointsTest {

    private final TotalPoints totalPoints = new TotalPoints();

    @Test
    void shouldReturnSumOfPoints() {
        // given
        String[] arr = new String[]{"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};

        // when
        int result = totalPoints.points(arr);

        // then
        assertEquals(30, result);
    }

    @Test
    void shouldReturnZeroPointsWhenHomeTeamDidNotWinAnyMetch() {
        // given
        String[] arr = {"0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"};

        // when
        int result = totalPoints.points(arr);

        // then
        assertEquals(0, result);
    }

}