/*
 *    3개의 정수를 받아서 평균/총점을 전송하는 메소드 
 *    1. 입력
 *    2. 처리 => 평균 / 총점
 *       => 세분화
 *    3. 출력
 */
import java.util.Scanner;
public class 메소드_5 {
	//절차적 언어 => 한번 사용 후 폐기
	static int userInput(int a)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(a+".정수 입력:");
		int num1=scan.nextInt();
		return num1;
	}
	//요청 처리 1
	static int total(int num1,int num2,int num3)
	{
		return num1+num2+num3;
	}
	//요청 처리 2
	static double div(int total)
	{
		return total/3.0;
	}
	// 출력
	static void print(int total,double avg)
	{
		System.out.println("평균:"+avg);
		System.out.println("총점:"+total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3개의 정수 받기
		/*Scanner scan=new Scanner(System.in);
		System.out.print("1.정수 입력:");
		int num1=scan.nextInt();
		
		System.out.print("2.정수 입력:");
		int num2=scan.nextInt();
		
		System.out.print("3.정수 입력:");
		int num3=scan.nextInt();
		
		//평균
		double avg=(num1+num2+num3)/3.0;
		//총점
		int total=num1+num2+num3;
		//출력
		System.out.println("평균:"+avg);
		System.out.println("총점:"+total);*/
		
		int num1=userInput(1);
		int num2=userInput(2);
		int num3=userInput(3);
		
		int total=total(num1,num2,num3);
		double avg=div(total);
		print(total,avg);
	}

}
