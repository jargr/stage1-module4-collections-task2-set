package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        var result = new HashSet<String>();
        result.addAll(firstSet);
        result.retainAll(secondSet);
        result.removeAll(thirdSet);
        var uniqueInThirdSet = new HashSet<>(thirdSet);
        uniqueInThirdSet.removeAll(firstSet);
        uniqueInThirdSet.removeAll(secondSet);
        result.addAll(uniqueInThirdSet);
        return result;
    }
}
