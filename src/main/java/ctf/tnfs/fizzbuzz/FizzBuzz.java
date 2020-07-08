package ctf.tnfs.fizzbuzz;

import java.util.function.Predicate;

public class FizzBuzz {
    private final Predicate<Integer> divisibleBy3 = divisible(3);
    private final Predicate<Integer> divisibleBy5 = divisible(5);
    private final Predicate<Integer> divisibleBy15 = x -> divisibleBy3.test(x) && divisibleBy5.test(x);

    public String fizzBuzz(int number) {
        if (divisibleBy15.test(number)) {
            return "fizzbuzz";
        } else if (divisibleBy3.test(number)) {
            return "fizz";
        } else if (divisibleBy5.test(number)) {
            return "buzz";
        } else {
            return String.valueOf(number);
        }
    }

    private Predicate<Integer> divisible(int n) {
        return x -> x % n == 0;
    }
}
