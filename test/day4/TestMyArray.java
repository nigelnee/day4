package day4;

import org.junit.Before;
import org.junit.Test;

public class TestMyArray {
//定义属性
	MyArray marr;
	
//	该方法，确保在所有后续方法执行前执行
	@Before
	public void iniMyArray(){
		marr = new MyArray();
	}
	
//	测试方法一般都是一对一的进行，可以确保每个方法是否能够正常运行
	@Test
	public void testPrintArray(){
		marr.printArray();
	}
	
	@Test
	public void testGetMax(){
		  marr.getMax();
	}
	
	@Test
	public void testGetMin(){
		 marr.getMin();
	}
	
	@Test
	public void testGetAve(){
		marr.getAve();
	}
	
	@Test
	public void testGetSum(){
		 marr.getSum();
	}
}
