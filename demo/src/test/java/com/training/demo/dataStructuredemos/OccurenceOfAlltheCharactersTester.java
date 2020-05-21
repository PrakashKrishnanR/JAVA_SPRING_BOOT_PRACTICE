package com.training.demo.dataStructuredemos;

import com.training.demo.dataStructureDemos.OccurenecesofAlltheCharacters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class OccurenceOfAlltheCharactersTester {

    @Autowired
    OccurenecesofAlltheCharacters occurenceOfAlltheCharacters;

    @Test
    public void inputTest1(){
        Assert.assertEquals("Not a expected result","s3u1c2e1",
               occurenceOfAlltheCharacters.printCountOfAlphabetsInaGivenString("Success"));
    }

    @Test
    public void inputTest2(){
        Assert.assertEquals("Not a expected result","a1t3e1n2i1o1",
                occurenceOfAlltheCharacters.printCountOfAlphabetsInaGivenString("Attention"));
    }

    @Test
    public void inputTest3(){
        Assert.assertEquals("Not a expected result","s1c1o1p1e1",
                occurenceOfAlltheCharacters.printCountOfAlphabetsInaGivenString("SCOPE"));
    }

    @Test
    public void inputTest4(){
        Assert.assertEquals("Not a expected result","m2y3t2e1s1w1a1",
                occurenceOfAlltheCharacters.printCountOfAlphabetsInaGivenString("MyTestMyway"));
    }

    @Test
    public void inputTest5(){
        Assert.assertEquals("Not a expected result","f2i1n1a1l1t2e1s1o2r1y1u1",
                occurenceOfAlltheCharacters.printCountOfAlphabetsInaGivenString("FinalTestForYOu"));
    }

}
