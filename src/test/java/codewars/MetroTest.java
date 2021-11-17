package codewars;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MetroTest {

    private final Metro metro = new Metro();

    @Test
    void shouldReturnNumberOfPassengersAfterLastStop() {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});
        assertEquals(5, metro.countPassengers(list));
    }
}