package dev.kuromiichi.aoc2024.day1;

import java.util.List;

class Common {
    private Common() {
    }

    public static final String INPUT_PATH = "src/main/java/dev/kuromiichi/aoc2024/day1/input.txt";

    /**
     * Splits the input and stores it into two lists, casting the strings to integers.
     *
     * @param input the input
     * @param left  the left list
     * @param right the right list
     */
    static void splitInput(String input, List<Integer> left, List<Integer> right) {
        input.lines().forEach(line -> {
            String[] split = line.split("\\h+");
            left.add(Integer.valueOf(split[0]));
            right.add(Integer.valueOf(split[1]));
        });
    }

    /**
     * Adds up all the integers in a list.
     *
     * @param list the list of integers
     * @return the sum of the integers in the list
     */
    static int sumIntegers(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }
}
