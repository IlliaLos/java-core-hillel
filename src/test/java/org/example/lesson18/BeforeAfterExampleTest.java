package org.example.lesson18;

import org.junit.jupiter.api.*;

public class BeforeAfterExampleTest {

    @Test
    @Disabled
    @Tag("JIRA-1234")
    void testOne() {
        System.out.println("test number one");
    }

    @Test
    @Tag("Feature")
    void testTwo() {
        System.out.println("test number two");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all");
    }
}
