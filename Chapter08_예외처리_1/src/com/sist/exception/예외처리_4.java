package com.sist.exception;
import java.util.Scanner;
public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[2]; // 배열범위 , 0
		try
		{
			System.out.print("첫번째 정수 입력:");
			String s1=scan.next();
			System.out.print("두번째 정수 입력:");
			String s2=scan.next();// 오류발생
			
			arr[0]=Integer.parseInt(s1); // 문자열을 정수로 변환
			arr[1]=Integer.parseInt(s2);// 문자열을 정수로변환
			
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
		}
		catch(ArrayIndexOutOfBoundsException ex) // 0 은 예외처리 못한다
		{
			//System.out.println(ex.getMessage()); // 에러 메세지만 출력
			ex.printStackTrace();//에러 발생시에 에러 위치 확인 (권장)
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// 기타적인 에러
		catch(NumberFormatException e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("정상수행");
		// 정상 수행 => catch 는 수행하지 않는다
		// try 안에서 오류발생 시 catch 수행
	}

}
