package com.controle.tdd;
import org.junit.jupiter.api.Test ;
import static org.junit.jupiter.api.Assertions.* ;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {

        assertEquals("1", FizzBuzz.de(1));
    }

    @Test
    public void testFizzBuzz1() {

        assertEquals("2", FizzBuzz.de(2));
    }

}
