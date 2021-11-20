package codewars;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayDiff {

    int[] doBetterSolution(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
//        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
//        or
        return listA.stream().mapToInt(e -> e).toArray();
    }

    int[] checkDiff(int[] a, int[] b) {
        var list1 = Arrays.stream(a).boxed().collect(Collectors.toList());
        var list2 = Arrays.stream(b).boxed().collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        list1
                .forEach(e -> {
                    if (!list2.contains(e)) {
                        result.add(e);
                    }
                });
        return convert(result);
    }

    private int[] convert(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
