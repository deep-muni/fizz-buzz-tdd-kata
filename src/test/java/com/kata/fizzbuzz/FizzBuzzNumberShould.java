package com.kata.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzNumberShould {

  @ParameterizedTest
  @CsvSource({"1, 1", "2, 2", "3, Fizz"})
  void convert_number_to_fizz_buzz_string(Integer value, String expected) {
    FizzBuzzNumber number = new FizzBuzzNumber(value);
    assertThat(number.convert()).isEqualTo(expected);
  }
}
