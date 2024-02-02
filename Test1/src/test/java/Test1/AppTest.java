package Test1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void exe_2_partition_C_min_positive()
    {
    	String result = App.NumberToChar(50);
    	String expected_result="C";
        org.junit.Assert.assertEquals(expected_result , result , 0.00001);
    }
    @Test
    public void exe_2_partition_C_min_plus1()
    {
    	String result = App.NumberToChar(51);
    	String expected_result="C";
        org.junit.Assert.assertEquals(expected_result , result , 0.00001);
    }
}
