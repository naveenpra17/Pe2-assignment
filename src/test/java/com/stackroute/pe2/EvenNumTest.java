package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class EvenNumTest {
    private EvenNum evenNum;
    @Before
    public void setup(){
        this.evenNum=new EvenNum();
    }
    @After
    public void teardown(){
        this.evenNum=null;
    }

    @Test
    public void givenInputShouldReturnTrue(){

        //act
        boolean result=evenNum.isEven(120);

        //assert
        assertEquals(true,result);
    }

    @Test
    public void givenInputShouldReturnfalse(){

        //act
        boolean result=evenNum.isEven(121);

        //assert
        assertEquals(false,result);
    }

    @Test
    public void givenInputShouldReturnTrueIfItIsNotNum(){
        //act
        boolean result=evenNum.isNotNum('d');

        //assert
        assertFalse(result);
    }

}
