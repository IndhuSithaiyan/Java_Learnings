package com.java.java8features.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface_ {

    public static void main(String[] args) {
//        Predicate<Integer> predicate = (t) -> {
//          if (t%2==0) {
//              return true;
//          } else {
//              return false;
//          }
//        };
//        System.out.println(predicate.test(7));

        // to simply
        Predicate<Integer> predicate = t -> t%2==0;
        System.out.println(predicate.test(7));

        // in streams API is having filter method - this will filter the stream of data based on the condition so we can go for the predicate
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        list1.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("print  Even: " + t));
    }
}

