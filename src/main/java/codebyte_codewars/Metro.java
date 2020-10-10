package codebyte_codewars;

import java.util.ArrayList;

class Metro {

    public int countPassengers(ArrayList<int[]> stops) {
        return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
    }
}
