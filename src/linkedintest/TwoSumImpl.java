/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedintest;

import java.util.HashSet;

public class TwoSumImpl implements TwoSum {

    private final HashSet<Integer> storedInts = new HashSet<>();
    

    @Override
    public void store(int input) {
        storedInts.add(input);
    }

    @Override
    public boolean test(int val) {
        if (storedInts.size() < 2) {
            return false;
        }

        for (Integer i : storedInts) {
            if(storedInts.contains(val - i))
                return true;
            
        }
        return false;
    }
}

interface TwoSum {

    /**
     * Stores @param input in an internal data structure.
     *
     * @param input
     */
    void store(int input);

    /**
     * Returns true if there is any pair of numbers in the internal data
     * structure which have sum @param val, and false otherwise. For example, if
     * the numbers 1, -2, 3, and 6 had been stored, the method should return
     * true for 4, -1, and 9, but false for 10, 5, and 0
     *
     * @param val
     * @return
     */
    boolean test(int val);
}