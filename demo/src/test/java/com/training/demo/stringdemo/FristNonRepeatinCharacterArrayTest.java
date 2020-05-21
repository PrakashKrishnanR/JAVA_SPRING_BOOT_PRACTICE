package com.training.demo.stringdemo;

import com.training.demo.stringdemos.FirstNonRepatingCharacterUsingArray;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class FristNonRepeatinCharacterArrayTest {

    @Autowired
    FirstNonRepatingCharacterUsingArray testerClass;

    @Test
    public void inputTest1(){
        Assert.assertEquals("Not a expected result",'u',
                (int)  testerClass.getNonRepaetedCharacter("Success"));
    }

    @Test
    public void inputTest2(){
        Assert.assertEquals("Not a expected result",0,
                (int) testerClass.getNonRepaetedCharacter("efefef"));
    }

    @Test
    public void inputTest3(){
        Assert.assertEquals("Not a expected result",'m',
                (int)  testerClass.getNonRepaetedCharacter("mydear"));
    }

    @Test
    public void inputTest4(){
        Assert.assertEquals("Not a expected result",'e',
                (int)  testerClass.getNonRepaetedCharacter("session"));
    }

    @Test
    public void inputTest5(){
        Assert.assertEquals("Not a expected result",'t',
                (int)  testerClass.getNonRepaetedCharacter("efefwWTh"));
    }

}
