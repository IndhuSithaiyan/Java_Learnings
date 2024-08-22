package com.java.java8features.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerInterface_ {

    public static void main(String[] args) {

        Consumer<Integer> consumer = t -> System.out.println("Printing  : " + t);
        consumer.accept(10);

        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("hello WorlD!");
        Consumer<String> c2 = (s) -> System.out.println(s.toLowerCase());
        c2.accept("hello WorlD!");
        c1.andThen(c2).accept("heloo WorlD! Java 8 features");  // giving both output

        //streams API foreach method is always accepts the consumer functional Interface
        // foreach is internally using the consumer functional interface and call the accept method by giving the argument
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        list1.stream().forEach(t -> System.out.println("print  : " + t));

    }
}
