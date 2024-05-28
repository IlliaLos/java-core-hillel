package org.example.homework13;

import org.junit.jupiter.api.Test;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTests {

    @Test
    void isStringNotBlank() {
        String candidateString = "What is the default value for string?";

        boolean result = StringUtils.isNotBlank(candidateString);

        assertTrue(result);
    }

    @Test
    void hasStringWhiteSpases() {
        String candidateString = "What is the default value for string?";

        boolean result = StringUtils.containsWhitespace(candidateString);

        assertTrue(result);
    }

    @Test
    void stringEndsWith() {
        String candidateString = "What is the default value for string?";

        boolean result = StringUtils.endsWith(candidateString, "ing?");

        assertTrue(result);
    }

    @Test
    void isStringNumeric() {
        String candidateString = "2566";

        boolean result = StringUtils.isNumeric(candidateString);

        assertTrue(result);
    }

    @Test
    void stringContainsChar() {
        String candidateString = "What is the default value for string?";

        boolean result = StringUtils.containsAny(candidateString, 'W');

        assertTrue(result);
    }

    @Test
    void stringContainsSubstring() {
        String candidateString = "What is the default value for string?";

        boolean result = StringUtils.containsAnyIgnoreCase(candidateString, "FOR");

        assertTrue(result);
    }

    @Test
    void isStringBlank() {
        String candidateString = "What is the default value for string?";

        boolean result = StringUtils.isBlank(candidateString);

        assertFalse(result);
    }

    @Test
    void stringStartsWith() {
        String candidateString = "What is the default value for string?";

        boolean result = StringUtils.startsWith(candidateString, "What");

        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"What", "the", "string"})
    void StringsContainChar(String candidateString) {
        boolean result = StringUtils.containsAny(candidateString,"t");

        assertTrue(result);
    }

    @Test
    void stringCompareOtherString() {
        String candidateString = "What Is The Default Falue For String?";

        int result = StringUtils.compareIgnoreCase("what is the default value for string?", candidateString);

        assertEquals(0, result);
    }
}
