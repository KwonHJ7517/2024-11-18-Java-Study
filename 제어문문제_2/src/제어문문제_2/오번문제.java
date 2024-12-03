package 제어문문제_2;

import java.util.Scanner;

public class 오번문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String a=scan.next(); //apple
		int i=0;
		int j=0;
		while(i<a.length()) {
			if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' )
				j++;
			i++;
		}
		System.out.println("모음의 갯수:"+j);
	}

}
