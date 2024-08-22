package com.java.java8features.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierInterface_ {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> { return "hello world";};
        System.out.println(supplier.get());

        //simply
        Supplier<String> supplier1 = () -> "hello world";
        System.out.println(supplier1.get());

        // If you are using any filtering process and if you are not getting any result
        // and you want to return some dummy data or meaning full response so we can go for the supplier
        List<String> list1 = Arrays.asList();
        System.out.println(list1.stream().findAny().orElseGet(() -> "Hi viewers")); // here list is empty so it won't find anything, so we use orElseGet from supplier

    }
}
