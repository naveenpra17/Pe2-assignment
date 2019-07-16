package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class FileReaderTest {

    private FileReader fileReader;

    @Before
    public void setUp(){
        fileReader=new FileReader();
    }

    @After
    public void tearUp(){
        fileReader=null;
    }


    public void testReadFileSuccessGivenFileNameAndExtensionShouldReturnByteArray() {
        String testString = "Hello. This is a test string";
        byte[] testByteArray = testString.getBytes();
        assertArrayEquals("testReadFileSuccessGivenFileNameAndExtensionShouldReturnByteArray: check readFile()",
                testByteArray, fileReader.readFile("test", "txt"));
    }


    /**
     * Test for readFile() to throw FileNotFoundException
     * when the wrong(non-existent) file path is given.
     */
    @Test(expected = FileNotFoundException.class)
    public void testReadFileFailureGivenFileNameAndExtensionShouldReturnFileNotFoundException() {
        fileReader.readFile("test1", "txt");
    }
}
