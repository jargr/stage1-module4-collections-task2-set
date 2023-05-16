package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        var squares = new TreeSet<Integer>();
        for (Integer number : sourceList) {
            squares.add(number * number);
        }
        return squares.subSet(lowerBound, true, upperBound, true);
    }
}
