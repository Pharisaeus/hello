package ctf.tnfs.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testFizzBuzz() {
        assertEquals("fizz", fizzBuzz.fizzBuzz(3));
        assertEquals("buzz", fizzBuzz.fizzBuzz(5));
        assertEquals("fizzbuzz", fizzBuzz.fizzBuzz(15));
        xxxxx
        assertEquals("2", fizzBuzz.fizzBuzz(2));
    }
}
