/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedintest;

import java.util.ArrayList;
/**
 * 1, -2, 3, and 6
 *
 * 4, -1, and 9, but false for 10, 5, and 0
 *
 * @author bradl
 */
public class Driver {

    static ArrayList<NestedInteger> NestedNumberList = new ArrayList<>();

    public static void main(String[] args) {
        // Ex #1: construct the list [{1,1},2,{1,1}]
        
        //contstruct {1,1}

        NestedInteger one = new NestedInteger();//Nested
        one.add(1);
        one.add(1);
        
        //construct 2
        NestedInteger two = new NestedInteger(2);//Integer
        
        //construct {1,1} in a different way
        NestedInteger aOne = new NestedInteger(1);//Integer
        NestedInteger bOne = new NestedInteger(1);//Integer
        NestedInteger differentOne = new NestedInteger();//Nested
        differentOne.add(aOne);
        differentOne.add(bOne);

        //construct entire [{1,1},2,{1,1}] list
        NestedNumberList.add(one);
        NestedNumberList.add(two);
        NestedNumberList.add(differentOne);
        
        System.out.println(NestedNumberList);
        
        int sum = reverseDepthSumClass.reverseDepthSum(NestedNumberList);
        System.out.println(sum);
        
        NestedNumberList = new ArrayList<>();
        
        //Ex #2: construct the list[{{6},4},1]
        NestedInteger six = new NestedInteger(6); // result [6]
        NestedInteger four = new NestedInteger(4);// result [4]
        NestedInteger oneB = new NestedInteger(1);// result [1]
        oneB.add(four); // result: [{4},1]
        four.add(six);  // result: [{{6},4},1]
        NestedNumberList.add(oneB);
        
        System.out.println(NestedNumberList);
        
        int sum2 = reverseDepthSumClass.reverseDepthSum(NestedNumberList);
        System.out.println(sum2);
        
//        TwoSumImpl twoSum = new TwoSumImpl();
//        twoSum.store(1);
//        twoSum.store(-2);
//        twoSum.store(3);
//        twoSum.store(6);
//        
//        System.out.println(twoSum.test(4));
//        System.out.println(twoSum.test(-1));
//        System.out.println(twoSum.test(9));
//        System.out.println(twoSum.test(10));
//        System.out.println(twoSum.test(5));
//        System.out.println(twoSum.test(0));
    }
}
