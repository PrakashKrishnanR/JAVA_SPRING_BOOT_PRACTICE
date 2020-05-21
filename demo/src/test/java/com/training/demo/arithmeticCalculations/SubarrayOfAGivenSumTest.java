package com.training.demo.arithmeticCalculations;

import com.training.demo.ArithmeticCaluclations.SumOfGivenSubArray;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SubarrayOfAGivenSumTest {

    @Autowired
    SumOfGivenSubArray testClass;

    @Test
    public void inputTest1(){
        List<List<Integer>> outputList = new ArrayList();
        List<Integer> subarray = new ArrayList<>();
        outputList.add((Arrays.asList(new Integer[]{2, 3})));
        outputList.add((Arrays.asList(new Integer[]{5})));
        Assert.assertEquals("not a valid output", outputList,
       testClass.subArray(new int[]{1, 2, 3, 4, 5}, 5) );

    }

    @Test
    public void inputTest2(){
        List<List<Integer>> outputList = new ArrayList();
        List<Integer> subarray = new ArrayList<>();
        outputList.add((Arrays.asList(new Integer[]{5, 4})));
        outputList.add((Arrays.asList(new Integer[]{9})));
        outputList.add((Arrays.asList(new Integer[]{9,0})));
        outputList.add((Arrays.asList(new Integer[]{0,8,1})));
        outputList.add((Arrays.asList(new Integer[]{8,1})));
        outputList.add((Arrays.asList(new Integer[]{6,3})));
        Assert.assertEquals("not a valid output", outputList,
                testClass.subArray(new int[]{5, 4, 9, 0, 8, 1, 6, 3, 3}, 9) );
    }

    @Test
    public void inputTest3(){
        List<List<Integer>> outputList = new ArrayList();
        Assert.assertEquals("not a valid output", outputList,
                testClass.subArray(new int[]{5,4}, 8) );
    }

}
