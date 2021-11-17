package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata4Test {

    private final Kata4 kata = new Kata4();

    @Test
    void shouldReturnSalaryWithBonus() {
        // given
        int salary = 10000;
        boolean isBonus = true;

        // when
        String result = kata.bonusTime(salary, isBonus);

        // then
        assertEquals("£100000", result);
    }

    @Test
    void shouldReturnSalaryWithoutBonus() {
        // given
        int salary = 10000;
        boolean isBonus = false;

        // when
        String result = kata.bonusTime(salary, isBonus);

        // then
        assertEquals("£10000", result);
    }
}