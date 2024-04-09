package org.example;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    //private Calculator calculator;

    @BeforeAll
    public static void setUpClass() {
        //E.G - Prepare/create the database
        System.out.println("WELCOME TO MY TESTS");
    }

    @AfterAll
    public static void tearDownClass() {
        //E.G - Delete the database
        System.out.println("BYE BYE");
    }

    @BeforeEach
    public void setUp() {
        //E.G - Create a bunch of math data to test
        //calculator = new Calculator();
        System.out.println("@BeforeEach - executed before each of the tests");
    }

    @AfterEach
    public void tearDown() {
        //E.G - Delete these math data used for the tests
        System.out.println("@AfterEach - executed after each of the tests");
    }

    @Test
    @DisplayName("Testing addition method with +")
    void positiveAdditionWithPositiveNumbersOk() {
        // Code strictly necessary to run test
        Calculator calculator = new Calculator();
        Assertions.assertEquals(5, calculator.positiveAddition(2, 3));
        Assertions.assertEquals(3, calculator.positiveAddition(0, 3));
        System.out.println("POSITIVE TEST");
    }

     /*    @Test
        //@DisplayName("Testing addition method with -")
        void additionWithNegativeNumbers() throws IllegalAccessException {
            Calculator calculator = new Calculator();
            Assertions.assertEquals(1, calculator.addition(-2,3));
            System.out.println("NEGATIVE TEST");
        }*/

    @Test
        //@DisplayName("Testing addition method with -")
    void positiveAdditionWithNegativeNumbersThrowsIllegalAccessException() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.positiveAddition(-1, 2));
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.positiveAddition(1, -2));
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.positiveAddition(-1, -2));
        System.out.println("NEGATIVE TEST");
    }

}
