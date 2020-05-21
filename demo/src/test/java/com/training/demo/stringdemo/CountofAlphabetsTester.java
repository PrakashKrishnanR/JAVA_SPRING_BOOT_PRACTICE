package com.training.demo.stringdemo;

import com.training.demo.stringdemos.CountOfAlphabets;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CountofAlphabetsTester {

    @Autowired
    public CountOfAlphabets countOfAlphabets;

    @Test
    public void inputTest1(){
        Assert.assertEquals("Not a expected result","s3u1c2e1",countOfAlphabets.printCountOfAlphabetsInaGivenString("Success"));
    }

    @Test
    public void inputTest2(){
        Assert.assertEquals("Not a expected result","a1t3e1n2i1o1",
                countOfAlphabets.printCountOfAlphabetsInaGivenString("Attention"));
    }

    @Test
    public void inputTest3(){
        Assert.assertEquals("Not a expected result","s1c1o1p1e1",
                countOfAlphabets.printCountOfAlphabetsInaGivenString("SCOPE"));
    }

    @Test
    public void inputTest4(){
        Assert.assertEquals("Not a expected result","m2y3t2e1s1w1a1",
                countOfAlphabets.printCountOfAlphabetsInaGivenString("MyTestMyway"));
    }

    @Test
    public void inputTest5(){
        Assert.assertEquals("Not a expected result","f2i1n1a1l1t2e1s1o2r1y1u1",
                countOfAlphabets.printCountOfAlphabetsInaGivenString("FinalTestForYOu"));
    }
}
