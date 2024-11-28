package ru.spbstu.telematics.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testCalculateScalarProduct_ValidVectors() {
        int[] vectorA = {1, 2, -3, 7};
        int[] vectorB = {4, -2, 6, 1};
        int expected = -11; // (1*4) + (2*-2) + (-3*6) + (7*1) = -11
        assertEquals(expected, App.calculateScalarProduct(vectorA, vectorB));
    }

    public void testCalculateScalarProduct_EmptyVectorA() {
        int[] vectorA = {};
        int[] vectorB = {4, -2, 6};
        try {
            App.calculateScalarProduct(vectorA, vectorB);
            fail("Ожидалось IllegalArgumentException для вектора A");
        } catch (IllegalArgumentException e) {
            assertEquals("Исключение: векторы не могут быть пустыми!", e.getMessage());
        }
    }

    public void testCalculateScalarProduct_EmptyVectorB() {
        int[] vectorA = {1, 2, -3};
        int[] vectorB = {};
        try {
            App.calculateScalarProduct(vectorA, vectorB);
            fail("Ожидалось IllegalArgumentException для вектора B");
        } catch (IllegalArgumentException e) {
            assertEquals("Исключение: векторы не могут быть пустыми!", e.getMessage());
        }
    }

    public void testCalculateScalarProduct_DifferentLengths() {
        int[] vectorA = {1, 2, -3};
        int[] vectorB = {4, -2};
        try {
            App.calculateScalarProduct(vectorA, vectorB);
            fail("Ожидалось IllegalArgumentException - разные длины векторов");
        } catch (IllegalArgumentException e) {
            assertEquals("Исключение: векторы должны иметь одинаковую длину!", e.getMessage());
        }
    }
}
