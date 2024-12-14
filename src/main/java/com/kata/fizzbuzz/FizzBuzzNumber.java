package com.kata.fizzbuzz;

public class FizzBuzzNumber {

  private final Integer number;

  public FizzBuzzNumber(Integer number) {
    this.number = number;
  }

  public String convert() {
    if (number.equals(3)) {
      return "Fizz";
    }
    if (number.equals(5)) {
      return "Buzz";
    }
    return number.toString();
  }
}
