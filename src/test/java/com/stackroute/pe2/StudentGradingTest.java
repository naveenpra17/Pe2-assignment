package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradingTest {

    private StudentGrading studentGrading;

    @Before
    public void setup(){
        this.studentGrading=new StudentGrading();
    }


    @After
    public void teardown(){
        this.studentGrading=null;
    }

    @Test
    public void testWhetherTheUserIsGivingRightInput(){
        //act


        boolean actualValue=studentGrading.getStudentInput(1,30);

        //assert
        assertTrue(actualValue);
    }

    @Test
    public void givenInputShouldReturnAverage(){
        //act
        int[] inputarr={10,20,30,40,50};
        int actualAverage=studentGrading.getAverage(inputarr);
        //assert
        assertEquals(30,actualAverage);
    }

    @Test
    public void givenInputShouldReturnMinimum(){
        //act
        int[] intputarr={10,20,30,40,50};
        int actualMinimumGrades=studentGrading.getMinimum(intputarr);

        //assert
        assertEquals(10,actualMinimumGrades);
    }

    @Test
    public void givenInputShouldReturnMaximum(){
        //act
        int[] inputarr={10,20,30,40};
        int actualMaximum=studentGrading.getMaximum(inputarr);

        //assert
        assertEquals(40,actualMaximum);
    }


}