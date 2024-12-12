package dev.kuromiichi.aoc2024.day1;

import dev.kuromiichi.aoc2024.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Day1Part1 {
    private static final String INPUT_PATH = "src/main/java/dev/kuromiichi/aoc2024/day1/input.txt";

    public static void main(String[] args) {
        String input = Utils.readInput(INPUT_PATH);

        String solution = solve(input);

        System.out.println("Solution: " + solution);
    }

    /**
     * Solves the problem
     *
     * @param input the input for the problem
     * @return the solution to the problem
     */
    private static String solve(String input) {
        // Split into two lists
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        splitInput(input, left, right);

        // Sort the lists
        sortLists(left, right);

        // Calculate the distance between each pair of elements
        List<Integer> distances = calculateDistances(left, right);

        // Sum the distances
        return String.valueOf(sumDistances(distances));
    }

    /**
     * Splits the input and stores it into two lists, casting the strings to integers
     *
     * @param input the input
     * @param left  the left list
     * @param right the right list
     */
    private static void splitInput(String input, List<Integer> left, List<Integer> right) {
        input.lines().forEach(line -> {
            String[] split = line.split("\\h+");
            left.add(Integer.valueOf(split[0]));
            right.add(Integer.valueOf(split[1]));
        });
    }

    /**
     * Sorts the lists
     *
     * @param left  the left list
     * @param right the right list
     */
    private static void sortLists(List<Integer> left, List<Integer> right) {
        left.sort(Integer::compareTo);
        right.sort(Integer::compareTo);
    }

    /**
     * Calculates the distance between each pair of elements in two lists
     *
     * @param left  the left list
     * @param right the right list
     * @return the distance between each pair of elements
     */
    private static List<Integer> calculateDistances(List<Integer> left, List<Integer> right) {
        return left.stream()
                .map(n -> Math.abs(n - right.get(left.indexOf(n))))
                .toList();
    }

    /**
     * Sums the distances
     *
     * @param distances the distances
     * @return the sum of the distances
     */
    private static int sumDistances(List<Integer> distances) {
        return distances.stream().reduce(0, Integer::sum);
    }
}
