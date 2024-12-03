package 제어문문제_2;

import java.util.Scanner;

public class 일번문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.print("단 입력(2~9):");
        int dan=scan.nextInt();
        
        System.out.println("======요청 결과값======");
        int i=1;
        while(i<=9)
        {
        	System.out.println(dan+"*"+i+"="+dan*i);
        	i++;
        }
//        for(int i=1;i<=9;i++)
//        {
//        	System.out.println(dan+"*"+i+"="+dan*i);
//        }
	}

}
