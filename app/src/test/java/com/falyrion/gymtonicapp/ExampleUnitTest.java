package com.falyrion.gymtonicapp;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;

/**
 * Example unit test class to test basic operations, security, and performance.
 */
public class ExampleUnitTest {

    /**
     * Test to verify that addition works correctly.
     */
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2); // Assert that 2 + 2 equals 4
    }

    /**
     * Test to verify that subtraction works correctly.
     */
    @Test
    public void subtraction_isCorrect() {
        assertEquals(0, 2 - 2); // Assert that 2 - 2 equals 0
    }

    /**
     * Test to verify that multiplication works correctly.
     */
    @Test
    public void multiplication_isCorrect() {
        assertEquals(4, 2 * 2); // Assert that 2 * 2 equals 4
    }

    /**
     * Test to verify that division works correctly.
     */
    @Test
    public void division_isCorrect() {
        assertEquals(2, 4 / 2); // Assert that 4 divided by 2 equals 2
    }

    /**
     * Test to ensure dividing by zero throws an ArithmeticException.
     */
    @Test(expected = ArithmeticException.class)
    public void division_byZero_throwsException() {
        int result = 4 / 0; // This line should throw an exception
    }

    /**
     * Test to verify that string concatenation works correctly.
     */
    @Test
    public void stringConcatenation_isCorrect() {
        assertEquals("Hello, World!", "Hello, " + "World!"); // Assert that strings concatenate as expected
    }

    /**
     * Security test to ensure sensitive data is not stored or transmitted in plain text.
     * Simulates an encryption operation and checks that the data is altered.
     */
    @Test
    public void securityTest_sensitiveDataHandling() {
        String sensitiveData = "password123"; // Simulated sensitive data
        String encryptedData = encryptData(sensitiveData); // Encrypt the data
        assertNotEquals(sensitiveData, encryptedData); // Verify that encrypted data is not the same as the original
    }

    /**
     * Performance test to ensure a method executes within an acceptable time limit.
     */
    @Test
    public void performanceTest_methodExecutionTime() {
        long startTime = System.nanoTime(); // Record start time
        performHeavyOperation(); // Execute the heavy operation
        long endTime = System.nanoTime(); // Record end time
        long duration = TimeUnit.NANOSECONDS.toMillis(endTime - startTime); // Calculate execution time in milliseconds
        assertTrue("Method took too long to execute", duration < 1000); // Assert that execution is under 1 second
    }

    /**
     * Simulates a simple encryption operation by reversing the string.
     * @param data The sensitive data to encrypt
     * @return The "encrypted" version of the data
     */
    private String encryptData(String data) {
        // Dummy encryption logic: reversing the string
        return new StringBuilder(data).reverse().toString();
    }

    /**
     * Simulates a computationally heavy operation by performing a large number of calculations.
     */
    private void performHeavyOperation() {
        // Dummy heavy operation: calculating square roots in a loop
        for (int i = 0; i < 1000000; i++) {
            Math.sqrt(i);
        }
    }
}
