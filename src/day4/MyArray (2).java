/**
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数
        然后求出所有元素的最大值，最小值，平均值，和值，并输出出来。
 */
package day4;

/**
 * @author samsung
 *
 */

import java.util.Random;

 class MyArray {
	//
	private int arr[];
	/*
	 * 给数组赋随机数值
	 */
	
	/*
	 * 第一个构造函数，不带参数
	 */
	public MyArray(){
        arr= new int[10];//创建一大小为10 的数组
		
		Random floa = new Random(10l);
		
		for(int i=0;i<arr.length;i++){
			int num = floa.nextInt(100);//生成随机整数
			arr[i] = num ;//将随机整数存入数组
		}
	}
	
	
	/*
	 * 第二个构造函数，带一个参数
	 * 
	 */
	public MyArray(int length){
        arr= new int[length];//创建一大小为10 的数组
		
		Random floa = new Random(10l);
		
		for(int i=0;i<arr.length;i++){
			int num = floa.nextInt(100);//生成随机整数
			arr[i] = num ;//将随机整数存入数组
		}
	}
	
	
	//打印数组中所有的数据
	public void printArray(){
		for(int i=0;i<arr.length;i++){
			System.out.println("a["+i+"] = "+arr[i]);
		}
	}
	
	
 	public void setArrayValue(int length){
		
	    arr= new int[length];//创建一大小为10 的数组
		
		Random floa = new Random(10l);
		
		for(int i=0;i<arr.length;i++){
			int num = floa.nextInt(100);//生成随机整数
			arr[i] = num ;//将随机整数存入数组
			System.out.print(arr[i]+" 初 ");
		}
		
	}

	
	
	//求数组中所有元素的最大值，输出[]
	public int getMax(){
				
		int max=arr[0];//记录较大值		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];//比较得出最大值
			}		
		}
		System.out.println("最大值为 ："+max);//输出最大值
		
	    return 0;
	}

	
	//求数组中中所有元素的最小值，输出[]
	public int getMin(){
		
		int min=arr[0];//记录较小值		
		for(int i=0;i<arr.length;i++){		
			if(arr[i]<min){
				min=arr[i];//比较得出最小值
			}		
		}
		
		System.out.println("最小值为 ："+min);//输出最小值
		
		return 0;
	}
	
	//求和
    public int getSum(){
    	
    	int sum = 0;		
		for(int i=0;i<arr.length;i++){			
			sum+=arr[i];//得到和值
		}  	
    	System.out.println("和值为 ："+sum);//输出和值
    	
    	return 0;
    }
    
    //求平均
    public int getAvg(){
    	
    	int sum = 0;
		float ave = 0;		
		for(int i=0;i<arr.length;i++){			
			sum+=arr[i];//得到和值
		}
		ave =(float) sum/10;//得到均值
    	
		System.out.println("均值为 ："+ave);//输出均值
    	return 0;
    }
    
    
    
    
    
    
    
    
    
    
}
