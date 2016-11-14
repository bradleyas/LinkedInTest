/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedintest;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the interface that represents nested lists. You should not implement
 * it, or speculate about its implementation.
 */
public class NestedInteger {

    private Integer value = null;
    private List<NestedInteger> list = null;

    public NestedInteger() {
    }

    public NestedInteger(Integer p) {
        value = p;
    }

    public void add(NestedInteger p) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(p);
    }

    public void add(int p) {
        add(new NestedInteger(p));
    }

    @Override
    public String toString() {
        if (isInteger()) {
            return Integer.toString(value);
        } else {
            return value != null ? list.toString() + "," + value : list.toString() ;
        }
    }

    /**
     * @return true if this NestedInteger holds a single integer, rather than a
     * nested list
     */
    boolean isInteger() {
        return list == null;
    }

    /**
     * @return the single integer that this NestedInteger holds, if it holds a
     * single integer. Return null if this NestedInteger holds a nested list
     */
    public Integer getInteger() {
        return value != null ? value : null;
    }

    /**
     * @return the nested list that this NestedInteger holds, if it holds a
     * nested list Return null if this NestedInteger holds a single integer
     */
    List<NestedInteger> getList() {
        return list;
    }
}
