
// Write a program that will take an integer and print Fizz if the number is
// divisible by 3, Buzz if the number is divisible by 5, FizzBuzz if the number
// is divisible by 3 and 5, and the number itself for all other cases.

import java.lang.Integer;;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        if (!(Integer.class.isInstance(number))) {
            return "Not a Number!";
        }

        else if (number % 3 == 0 && number % 5 == 0) {
            return "Fizz Buzz";
        }

        else if (number % 3 == 0) {
            return "Buzz";
        }

        else if (number % 5 == 0) {
            return "Fizz";
        }

        else {
            return "Number not divisible by 3 or 5";
        }
    }
}