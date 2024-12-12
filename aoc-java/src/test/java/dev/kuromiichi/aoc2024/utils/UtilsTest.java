package dev.kuromiichi.aoc2024.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    @Test
    void testReadInput() {
        String expected = """
                this
                is
                a test
                input.txt""";

        String actual = Utils.readInput("src/test/java/dev/kuromiichi/aoc2024/utils/test-input.txt.txt");

        assertEquals(expected, actual, "Input was not read correctly");
    }
}