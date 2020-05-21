package com.training.demo.ArithmeticCaluclations;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SumOfGivenSubArray {
    /**
     * this function will return List of subarray from the given input array on which the sum
     * of values of the sub array will be equal to expected sum
     * @param inputArray Input array
     * @param expectedsum expectedSum value
     * @return list of sub array matching the given sum
     *
     * Example 1:
     *  given input: {1, 2, 3, 4, 5}, 5
     *  output : [[2,3],[5]]
     * Example 2:
     * given Input: {{5,4}, 8}
     * output: []
     *
     * 1. Use the tester class in the test folder for the purpose of debugging and testing your source code
     * 2. The function should satisfy all the cases in the testClass file
     * 3. Use any Collections.
     */
    public List<List<Integer>> subArray(int[] inputArray, int expectedsum){

        List<List<Integer>> returnList = new ArrayList();
        List<Integer> subArrayList;
        int sum =0;
        for(int i=0; i< inputArray.length; i++){
            sum = inputArray[i];
            if(sum == expectedsum){
                subArrayList = new ArrayList<>();
                subArrayList.add(inputArray[i]);
                returnList.add(subArrayList);
            }
            for (int j= i+1; j< inputArray.length; j++){
                sum += inputArray[j];
                if( sum > expectedsum){
                    break;
                }else if (sum == expectedsum){
                    subArrayList = new ArrayList<>();
                    int index =0;
                    for(int k=i; k<=j;k++){
                        subArrayList.add(inputArray[k]);
                        index++ ;
                    }
                    returnList.add(subArrayList);
                }
            }
        }
        return returnList;
    }
}
