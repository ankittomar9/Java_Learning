package com.company;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;

public class LambdaExample {
    public static void main(String[] args) {

        IntFunction<Integer> square = x -> x * x;
        System.out.println(square.apply(5)); // Output: ?

        BinaryOperator<Integer> addition = (x, y) -> x + y;
        System.out.println(addition.apply(10, 20)); // Output: ?

        Function<Integer, Integer> increment = x -> x + 1;
        System.out.println(increment.apply(7)); // Output: ?
    }
}
