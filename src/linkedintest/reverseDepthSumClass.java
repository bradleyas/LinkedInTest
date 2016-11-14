/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedintest;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author bradl
 */
public class reverseDepthSumClass {

    private static int depth = 0;
    private static int maxdepth = 0;
    private static HashMap values;

    /**
     *
     * @param input
     * @return
     */
    public static int reverseDepthSum(List<NestedInteger> input) {
        values = new HashMap();

        constructValueHash(input);

        int sum = 0;
        for (int i = 0; i < values.size(); i++) {
            sum = sum + (int) values.get(i) * (values.size() - i);
        }

        return sum;
    }

    public static void constructValueHash(List<NestedInteger> input) {
        for (NestedInteger ni : input) {
            if (!ni.isInteger()) {
                depth++;

                if (depth > maxdepth) {
                    maxdepth = depth;
                }

                constructValueHash(ni.getList());
                depth--;
                if(ni.getInteger() != null){
                    values.put(depth, ni.getInteger());
                }
            }
            else {
                if (values.containsKey(depth)) {
                    Integer operand = (Integer) values.get(depth);
                    values.replace(depth, operand + ni.getInteger());
                } else {
                    values.put(depth, ni.getInteger());
                }
            }
        }
    }
}
