package com.sist.exception;
// 임의 발생은 한개만 사용 => if
import java.util.Scanner;
/*
 *    웹
 *    a.jsp?no=1
 *    IllegalArgumentException 에러 발생
 *    
 *    public void display(int no) => String no
 *    {
 *        => 정수형 변환 Integer.garseInt(no)
 *                    ------ 데이터형 클래스 => Wrapper
 *    }
 */
public class 예외처리_임의발생_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("국어 점수 입력:");
			int kor=scan.nextInt();
			if(kor<0 || kor>100)
			{
				// 잘못된 입력 => 직접처리
				// catch 를 불러온다
				throw new IllegalArgumentException("점수는 0이상 100이하만 가능");
				// throw => 필요시에 의해 catch 호출 가능
				// 아래는 코딩이 불가능
			}
		}catch(IllegalArgumentException e)
		{
			// 매개변수에 전송값이 다른 경우
			System.out.println(e.getMessage());
		}
	}

}
