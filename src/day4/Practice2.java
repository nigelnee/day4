package day4;

public class Practice2 {
	public static void main(String[] args) {
		String x=args[0];
		int X=Integer.parseInt(x);
		String y=args[1];
		int Y=Integer.parseInt(y);//头等舱是1，经济舱是2
		double m;
		switch(X){
		case 4:
		case 5:
		case 6:
		case 7:	
		case 8:
		case 9:
		case 10:
			if (Y==1)
				m=5000*0.9;	
			else m=5000*0.8;
			System.out.println(m);
		    break;
		default:
			if(Y==1)
				m=5000*0.5;
			else  m=5000*0.4;
			System.out.println(m);
		}
}
}
