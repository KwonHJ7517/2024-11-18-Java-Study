package com.sist.lang;
/*
 *  Wrapper
 *         : 기본형(데이터형)을 클래스화 시켜 사용이 편리하게 만든 클래스
 *           byte ==> Byte
 *           short ==> Short
 *           ---------------- 사용 빈도 낮음
 *         ***int ==> Integer
 *         ***long ==> Long
 *            float ==> Float
 *         ***double ==> Double
 *            char ==> Character
 *         ***boolean => Boolean
 *         
 *      => 변환 (문자열)
 *      => 데이터형 통일화 : 제네릭스 (<클래스형>)
 *                      => ex) <int> (x) <Integer> (o)
 *      => 기능이 많다
 *      => 일반 기본형과 호환
 *         Integer i=10 / int i=10 둘다 같다
 *         
 *         Integer i=(int)10.5;
 */
import java.util.Scanner;
public class 라이브러리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 진법변환 : 8진법 , 2진법 , 16진접
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		Integer i=scan.nextInt();
		
		System.out.println(Integer.toOctalString(i)); // 8진법
		System.out.println(Integer.toHexString(i)); // 16진법
		System.out.println(Integer.toBinaryString(i)); // 2진법
		// 2. 범위 : 데이터형의 범위
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.print("첫번째 문자열입력:");
		String s1=scan.next();
		System.out.print("두번째 문자열입력:");
		String s2=scan.next();
		// 3. 변환 : 문자열을 정수형으로 변환
		System.out.println(s1+s2); // String을 사용했으므로 문자열로 출력됌
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); // 정수형으로 변환 출력
	}

}
