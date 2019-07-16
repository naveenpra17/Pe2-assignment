package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.map;
import static org.junit.Assert.*;

public class FreqencyOfWordsCheckerTest {

    private FreqencyOfWordsChecker freqencyOfWordsChecker;

    @Before
    public void setup(){
        freqencyOfWordsChecker=new FreqencyOfWordsChecker();

    }
    @After
    public void teardown(){
        freqencyOfWordsChecker=null;
    }

    //test case for checking the freqency of words;
    @Test
    public void givenFileShouldReturnTheFreqencyOfWords(){


        HashMap<String, Integer> map = new HashMap<>();

        print(map);
        map.put("vishal", 1);
        map.put("sachin", 3);
        map.put("vaibhav", 2);

        //assert
        assertArrayEquals(freqencyOfWordsChecker.fileTextExtractor(map),"text/.txt");
    }
    //this method will return an exception
    @Test(expected = FileNotFoundException.class)
    public void testReadFileFailureGivenFileNameAndExtensionShouldReturnFileNotFoundException() {
        fileReader.readFile("test1", "txt");
    }
}
}