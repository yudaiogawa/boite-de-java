package com.example.problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @CsvSource({
        "1,         1",
        "2,         2",
        "3,      Fizz",
        "4,         4",
        "5,      Buzz",
        "6,      Fizz",
        "14,       14",
        "15, FizzBuzz",
        "16,       16",
        "30, FizzBuzz"
    })
    void fizzBuzz(int num, String exp) {
        assertThat(fizzBuzz.convert(num), is(exp));
    }

    @Nested
    class convertは数値を文字列に変換する {
        @Nested
        class _3の倍数の場合は数値をFizzに変換 {
            @Test
            void _3を渡すと文字列Fizzを返す() {
                assertThat(fizzBuzz.convert(3), is("Fizz"));
            }
        }

        @Nested
        class _5の倍数の場合は数値をBuzzに変換 {
            @Test
            void _5を渡すと文字列Buzzを返す() {
                assertThat(fizzBuzz.convert(5), is("Buzz"));
            }
        }

        @Nested
        class _15の倍数の場合は数値をFizzBuzzに変換 {
            @Test
            void _15を渡すと文字列FizzBuzzを返す() {
                assertThat(fizzBuzz.convert(15), is("FizzBuzz"));
            }
        }

        @Nested
        class その他の数の場合はそのまま文字列に変換 {
            @Test
            void _1を渡すと文字列1を返す() {
                assertThat(fizzBuzz.convert(1), is("1"));
            }
        }
    }
}
