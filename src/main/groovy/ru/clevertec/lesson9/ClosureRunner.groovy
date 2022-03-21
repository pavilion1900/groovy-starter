package ru.clevertec.lesson9

import java.util.function.Function
import java.util.stream.Stream

class ClosureRunner {
    static void main(String[] args) {
//        Function<Integer, Integer> function = elem -> elem + elem
//        def result = function.apply(10);
//        println result

//        Closure closure = elem -> elem + elem
        Closure closure = { elem ->
            println elem
            elem + elem
        }

//        Closure closure = { elem = 78 ->
//            println elem
//            elem + elem
//        }
//        def result2 = closure.call(5)
//        println closure.call()

        Stream.of(1, 2, 3, 4, 5)
//                .map(elem -> elem + elem)
//                .map(function)
                .map(closure)
//                 .map(String::valueOf)
                .map(String.&valueOf)
                .forEach(System.out::println)

        int x = 10
        check(x > 10) {
            println x
        }
    }

    static def check(boolean condition, Closure closure) {
        if (condition) {
            closure()
        }
    }
}
