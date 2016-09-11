package Ravikumar.Sujatha.SumofNNumbers;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.InputStream;
import java.util.Scanner;

import java.io.ByteArrayInputStream;

/**
 * Created by sujatharavikumar on 9/9/16.
 */
public class SumOfNNumbersTest {
    /*
    @Test
    public void getInputTest(){
        SumOfNNumbers obj = new SumOfNNumbers();
        String input = "5";
        //InputStream stdin = System.in;
        //System.setIn(new ByteArrayInputStream(input.getBytes()));
        //Scanner scanner = new Scanner(System.in);
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(input,5);

    }*/

    @Test
    public void sumTest(){
        Calculator obj = new Calculator();

        int expectedValue = 15;
        int actualValue = obj.sum(5);

        assertEquals("The sum of first 5 numbers", expectedValue, actualValue);
    }




}
