package 제어문문제_2;

import java.util.Scanner;

public class 구번문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int i=1;
		int max=0;
		while(i<=5)
		{
			int num=(int)(Math.random()*100)+1;
			System.out.print(num+" ");
			if(max<num)
				max=num;
			i++;
		}
		System.out.println("최대값:"+max);
		
	}

}
