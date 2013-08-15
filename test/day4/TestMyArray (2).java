/**
 * 
 */
package day4;

import org.junit.Before;
import org.junit.Test;

/**
 * @author samsung
 *
 */
public class TestMyArray {
	//定义属性
	MyArray marr;
	
	
	/*
	 * 该方法，确保在所有后续执行之前 执行
	 */
	@Before
    public void iniMyArray(){   //初始化
    	marr = new MyArray();    	
    }
    
	/*
	 * 测试方法，一般都是一对一的进行
	 * 可以确保每个方法是否能够正常运行
	 */
	@Test
    public void testPrintArray(){
    	marr.printArray();
    }
    
	@Test
    public void testGetMax(){
    	int max = marr.getMax();
    }
	
	@Test
	public void testGetMin(){
		int min = marr.getMin();
	}
	
	@Test
	public void testGetSum(){
		int sum = marr.getSum();
	}
	
	@Test
	public void testGetAvg(){
		int avg = marr.getAvg();
	}
	
	@Test
	public void testSetArrayValue(){
		marr.setArrayValue(20);
	}
}
