package day4;

public class MyArray {

	private int[] arr;

	
	public MyArray(){
        arr= new int[10];//创建一大小为10 的数组
		
		//Random floa = new Random(10l);
        //arr[i] = (int) (Math.random() * 100);
        
		for(int i=0;i<arr.length;i++){
			arr[i] = (int) (Math.random() * 100);
			//int num = floa.nextInt(100);//生成随机整数
			//arr[i] = num ;//将随机整数存入数组
		}
	}
	
	// 给数组赋随机数的值
	public void setValues(int length) {
		arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
	}

	public void printArray() {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++){
			System.out.println("  "+arr[i]+"   ");
		}
	}
	
	public int getSum() {

		int Sum = 0;
		for (int i = 0; i < arr.length; i++) {
			Sum = Sum + arr[i];
		}
		System.out.println("Sum=" + Sum);
		return Sum;

	}

	public int getAve() {
		int Ave = 0;
		for (int i = 0; i < arr.length; i++) {
			Ave = arr[i] / arr.length;
			
		}
		System.out.println("Ave=" + Ave);
		return Ave;
	}

	public int getMax() {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				// 交换两个数字
				max = arr[i];
			}
		}
		System.out.println("数组中最大值为" + max);
		return max;
	}

	public int getMin() {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				// 交换两个数字
				min = arr[i];

			}
			

		}
		System.out.println("数组中最小值为" + min);
		return min;
	}

	
}
