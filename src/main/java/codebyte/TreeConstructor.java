package codebyte;

import java.util.*;

public class TreeConstructor {

    public static String treeConstructor(String[] strArr) {
        Set<String> children = new HashSet<>();
        Map<String, Integer> parents = new HashMap<>();

        for (String node : strArr) {
            List<String> values = Arrays.asList(node.replaceAll("[^\\d,]", "").split(","));
            children.add(values.get(0));
            Integer count = parents.get(values.get(1));

            if (count != null && count + 1 > 2) {
                return "false";
            } else {
                parents.put(values.get(1), (count == null ? 1 : ++count));
            }
        }
        return String.valueOf((children.size() == strArr.length));
    }

    public static void main(String[] args) {
        System.out.print(treeConstructor(new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}));
    }

}

