package dev.kuromiichi.aoc2024.day1;

import dev.kuromiichi.aoc2024.utils.Utils;

import java.util.ArrayList;
import java.util.List;

import static dev.kuromiichi.aoc2024.day1.Common.*;

public class Day1Part1 {
    public static void main(String[] args) {
        String input = Utils.readInput(INPUT_PATH);

        String solution = solve(input);

        System.out.println("Solution: " + solution);
    }

    /**
     * Solves the problem.
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
        int sum = sumIntegers(distances);

        return String.valueOf(sum);
    }

    /**
     * Sorts the lists.
     *
     * @param left  the left list
     * @param right the right list
     */
    private static void sortLists(List<Integer> left, List<Integer> right) {
        left.sort(Integer::compareTo);
        right.sort(Integer::compareTo);
    }

    /**
     * Calculates the distance between each pair of elements in two lists.
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
}
