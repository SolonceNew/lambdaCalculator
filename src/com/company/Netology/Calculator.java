package com.company.Netology;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;
// 2-й способ:
//  BinaryOperator<Integer> devide = (x, y) -> {
//      int result;
//      if(y == 0) {
//         System.out.println("Внимание! Деление на 0! Делить на 0 нельзя!");
//         result = 0;
//     } else {
//     result =  x / y;
//     }
//     return result;
// };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : 0 * -1;


    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
