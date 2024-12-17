package com.sist.exception;

public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문장 1");
		System.out.println("문장 2");
		System.out.println("문장 3");
		try
		{
			System.out.println("문장 4");
			System.out.println(10/0); // catch 이동
			System.out.println("문장 6");
			// 에러가 발생하여 catch 로 이동하게되면 밑에 있는 문장들도 포함하여 수행불가능
		}catch(Exception e)
		{
			System.out.println("문장 7"); // try의 문장이 에러가 없을 경우엔 제외
		}
		System.out.println("문장 8");
		System.out.println("문장 9");
	}

}
