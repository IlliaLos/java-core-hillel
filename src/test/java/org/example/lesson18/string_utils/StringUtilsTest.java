package org.example.lesson18.string_utils;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    void isBlankTest() {
        String blankString = "";

        boolean result = StringUtils.isBlank(blankString);

        assertTrue(result);
    }

    @Test
//    @RepeatedTest(4)
    @DisplayName("Is non blank string considered as non blank")
    void isBlankTestNonBlankString() {
        String blankString = "a string";

        boolean result = StringUtils.isBlank(blankString);

        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"enable", "disable", "able"})
    void isPalindromeTest(String candidate) {
        boolean result = StringUtils.endsWith(candidate, "able");

        assertTrue(result);
    }


}