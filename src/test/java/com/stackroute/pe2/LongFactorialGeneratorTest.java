package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongFactorialGeneratorTest {
    private LongFactorialGenerator longFactorialGenerator;
    @Before
    public void setup(){
        longFactorialGenerator=new LongFactorialGenerator();
    }
    @After
    public void teardowm(){
        longFactorialGenerator=null;
    }

    @Test
    public void givenIntValueWillGenerateFactorial(){
        //give int as input and this method will return fact of that value
        //act
        int factorial=longFactorialGenerator.factorialGenerator(5);

        //assert
        assertEquals(120,factorial);
    }

    @Test
    public void givenIntegerShouldCheckForLongValue(){
        //this will check for long data type
        //act
        long factorial=longFactorialGenerator.getLongFactorial(20);
        //assert

        assertEquals(2432902008176640000,factorial);
    }


    @Test(expected = )
    public void givenIntegerShouldReturnException(){
    //this will throw an exception
        //act
        Exception exception=longFactorialGenerator.factorialGeneratorWithErrorBecauseOfIncompatibeDataType(13);


        //assert
        assertArrayEquals(Exception,exception);
    }
}