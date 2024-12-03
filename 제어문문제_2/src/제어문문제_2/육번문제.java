package 제어문문제_2;

import java.util.Scanner;

public class 육번문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력(1~9):");
		int num=scan.nextInt();
		int i=10;
		while(i<=99)
		{
			int a=i/10;
			int b=i%10;
			if(a+b==num)
				System.out.print(i+" ");
			i++;
		}
	}

}
