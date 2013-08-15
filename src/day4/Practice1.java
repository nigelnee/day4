package day4;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("请输入月份");
		Scanner a = new Scanner(System.in);
		int b  = a.nextInt();
		if (b>=4&&b<=10){
			System.out.println("请问你选择的是头等舱还是经济舱？1 头等舱，2 经济舱");
			Scanner c = new Scanner(System.in);
			int d  = c.nextInt();
			if (d==1){
				System.out.println("您的机票价格为："+ 5000*0.9);
				 if(d==2){
					 System.out.println("您的机票价格为："+ 5000*0.8);
				}
			}
		}
		else
		{
			System.out.println("请问你选择的是头等舱还是经济舱？1 头等舱，2 经济舱");
			Scanner c = new Scanner(System.in);
			int d  = c.nextInt();
			if (d==1){
				System.out.println("您的机票价格为："+ 5000*0.5);
				 if(d==2){
					 System.out.println("您的机票价格为："+ 5000*0.4);
				}
			}
		}
	}

}
