package com.kata.fizzbuzz;

public class FizzBuzzNumber {

  private final Integer number;

  public FizzBuzzNumber(Integer number) {
    this.number = number;
  }

  public String convert() {
    if (isNumberDivisibleBy(3) && isNumberDivisibleBy(5)) {
      return "FizzBuzz";
    }
    if (isNumberDivisibleBy(3)) {
      return "Fizz";
    }
    if (isNumberDivisibleBy(5)) {
      return "Buzz";
    }
    return number.toString();
  }

  private boolean isNumberDivisibleBy(Integer divisor) {
    return number % divisor == 0;
  }
}
