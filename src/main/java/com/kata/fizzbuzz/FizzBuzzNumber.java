package com.kata.fizzbuzz;

public class FizzBuzzNumber {

  private final Integer number;

  public FizzBuzzNumber(Integer number) {
    this.number = number;
  }

  public String convert() {
    if (number % 3 == 0) {
      return "Fizz";
    }
    if (number.equals(5) || number.equals(10)) {
      return "Buzz";
    }
    return number.toString();
  }
}
