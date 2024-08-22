package com.java.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_ {

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);


        Iterator<Integer> iterator = numList.iterator();

        while (iterator.hasNext()){
            int next = iterator.next();
            System.out.println(next);
            // Removing odd elements
            if (next % 2 != 0)
                iterator.remove();
        }

        System.out.println(numList);

    }
}
