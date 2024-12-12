package dev.kuromiichi.aoc2024.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class Utils {
    private Utils() {
    }

    /**
     * Reads the input file and returns it as a string
     *
     * @param filePath the path to the input file
     * @return a string containing the input
     */
    public static String readInput(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return reader.lines().collect(Collectors.joining("\n"));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
