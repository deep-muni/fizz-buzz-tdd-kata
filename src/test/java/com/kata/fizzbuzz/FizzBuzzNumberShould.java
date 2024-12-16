package com.kata.fizzbuzz;

import static com.kata.fizzbuzz.FizzBuzzNumber.BUZZ;
import static com.kata.fizzbuzz.FizzBuzzNumber.FIZZ;
import static com.kata.fizzbuzz.FizzBuzzNumber.FIZZ_BUZZ;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzNumberShould {

  @ParameterizedTest
  @CsvSource({
    "1, 1", "2, 2", "4, 4", "7, 7", "8, 8", "11, 11", "13, 13", "14, 14",
  })
  void convert_to_number_when_not_divisible_by_three_or_five(Integer value, String expected) {
    FizzBuzzNumber number = new FizzBuzzNumber(value);
    assertThat(number.convert()).isEqualTo(expected);
  }

  @ParameterizedTest
  @ValueSource(ints = {3, 6, 9, 12, 18, 21, 24, 27})
  void convert_to_Fizz_when_divisible_by_three_only(Integer value) {
    FizzBuzzNumber number = new FizzBuzzNumber(value);
    assertThat(number.convert()).isEqualTo(FIZZ);
  }

  @ParameterizedTest
  @ValueSource(ints = {5, 10, 20, 25})
  void convert_to_Buzz_when_divisible_by_five_only(Integer value) {
    FizzBuzzNumber number = new FizzBuzzNumber(value);
    assertThat(number.convert()).isEqualTo(BUZZ);
  }

  @ParameterizedTest
  @ValueSource(ints = {15, 30})
  void convert_to_FizzBuzz_when_divisible_by_three_and_five(Integer value) {
    FizzBuzzNumber number = new FizzBuzzNumber(value);
    assertThat(number.convert()).isEqualTo(FIZZ_BUZZ);
  }
}
