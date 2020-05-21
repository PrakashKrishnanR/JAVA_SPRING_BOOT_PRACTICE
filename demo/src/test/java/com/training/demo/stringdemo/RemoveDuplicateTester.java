package com.training.demo.stringdemo;

import com.training.demo.stringdemos.RemoveDuplicateWords;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RemoveDuplicateTester {

    @Autowired
    RemoveDuplicateWords removeDuplicateWords;

    @Test
    public void inputTest1(){
        Assert.assertEquals("Not as Expected",
                "Good morning day night",
                removeDuplicateWords.removeDuplicateWords
                        ("Good morning Good day Good night night day")
                );
    }

    @Test
    public void inputTest2(){

        Assert.assertEquals("Not as Expected",
                "my daybreak day may die break here bye",
                removeDuplicateWords.removeDuplicateWords
                        ("my daybreak day may die break here bye bye bye")
        );

    }

    @Test
    public void inputTest3(){

        Assert.assertEquals("Not as Expected",
                "may hi say mi",
                removeDuplicateWords.removeDuplicateWords
                        ("may hi may say mi may say mi")
        );

    }

    @Test
    public void inputTest4(){

        Assert.assertEquals("Not as Expected",
                "she sells sea call die here",
                removeDuplicateWords.removeDuplicateWords
                        ("she sells sea sells she call die here")
        );

    }

    @Test
    public void inputTest5(){

        Assert.assertEquals("Not as Expected",
                "may day might be new thing",
                removeDuplicateWords.removeDuplicateWords
                        ("may day may day might be might be new thing new")
        );

    }

}
