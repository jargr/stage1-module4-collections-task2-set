package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        var result = new HashSet<Integer>();

        for (Integer number : sourceList) {
            if (number % 2 == 0) {
                while (number % 2 == 0) {
                    result.add(number);
                    number /= 2;
                }
                result.add(number);
            } else {
                result.add(number);
                result.add(number * 2);
            }
        }

        return result;

    }
}
