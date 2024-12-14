package com.kata.fizzbuzz;

public class FizzBuzzNumber {

  public static final String FIZZ = "Fizz";
  public static final String BUZZ = "Buzz";
  public static final String FIZZ_BUZZ = "FizzBuzz";

  private final Integer number;

  public FizzBuzzNumber(Integer number) {
    this.number = number;
  }

  public String convert() {
    if (isNumberDivisibleBy(3) && isNumberDivisibleBy(5)) {
      return FIZZ_BUZZ;
    }
    if (isNumberDivisibleBy(3)) {
      return FIZZ;
    }
    if (isNumberDivisibleBy(5)) {
      return BUZZ;
    }
    return number.toString();
  }

  private boolean isNumberDivisibleBy(Integer divisor) {
    return number % divisor == 0;
  }
}
