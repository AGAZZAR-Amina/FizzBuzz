package com.controle.tdd;
import org.junit.jupiter.api.Test ;
import static org.junit.jupiter.api.Assertions.* ;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz1() {

        assertEquals("1", FizzBuzz.de(1));
    }

    @Test
    public void testFizzBuzz2() {

        assertEquals("2", FizzBuzz.de(2));
    }

    @Test
    public void testFizzBuzz3() {

        assertEquals("Fizz", FizzBuzz.de(3));
    }
    @Test
    public void testFizzBuzz6() {

        assertEquals("Fizz", FizzBuzz.de(6));
    }

    @Test
    public void testFizzBuzz9() {

        assertEquals("Fizz", FizzBuzz.de(9));
    }

    @Test
    public void testFizzBuzz18() {

        assertEquals("Fizz", FizzBuzz.de(18));
    }


    @Test
    public void testFizzBuzz5() {

        assertEquals("Buzz", FizzBuzz.de(5));
    }

}
