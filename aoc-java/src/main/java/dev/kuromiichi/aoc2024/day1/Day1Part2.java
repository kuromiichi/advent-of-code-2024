package dev.kuromiichi.aoc2024.day1;

import dev.kuromiichi.aoc2024.utils.Utils;

import java.util.ArrayList;
import java.util.List;

import static dev.kuromiichi.aoc2024.day1.Common.*;

public class Day1Part2 {
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

        // Calculate similarity for each element in the left list
        List<Integer> similarities = calculateSimilarities(left, right);

        // Sum the similarities
        int sum = sumIntegers(similarities);

        // Return the sum
        return String.valueOf(sum);
    }

    /**
     * Calculates the similarity for each element in the left list
     *
     * @param left  the left list
     * @param right the right list
     * @return the similarity for each element in the left list
     */
    private static List<Integer> calculateSimilarities(List<Integer> left, List<Integer> right) {
        return left.stream()
                .map(n -> n * (int) right.stream().filter(n::equals).count())
                .toList();
    }
}
