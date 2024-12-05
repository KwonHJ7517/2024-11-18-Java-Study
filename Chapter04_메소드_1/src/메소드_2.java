// 사칙연산자 ==> 5개의 메소드
// 회원가입 - 회원탈퇴
import java.util.Scanner;
public class 메소드_2 {
	// 1) 리턴형 / 매개변수 => o
	// +
	static int plus(int a,int b)
	{
		int c=a+b;
		return c;
	}
	// -
	static int minus(int a,int b)
	{
		int c=a-b;
		return c;
	}
	// *
	static int gop(int a,int b)
	{
		int c=a*b;
		return c;
	}
	// / 나누기
	static String div(int a,int b)
	{
		String result="";
		if(b==0)
			result="0으로 나눌 수 없습니다";
		else
			result=String.valueOf(a/(double)b);
		
		return result; // 리턴형에 선언된 데이터형과 일치
	}
	// 조립
	static void process()
	{
		//main
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/):");
		String op=scan.next();
		
		// switch , 다중조건문
		if(op.equals("+"))
		{
			System.out.println(num1+"+"+num2+"="+plus(num1,num2));//int c=plus(num1+num2)선언하지 않았으면 c대신 plus(num1,num2)를 대입해도 된다
		}
		else if(op.equals("-"))
		{
			System.out.println(num1+"-"+num2+"="+minus(num1,num2));
		}
		else if(op.equals("*"))
		{
			System.out.println(num1+"*"+num2+"="+gop(num1,num2));
		}
		else if(op.equals("/"))
		{
			System.out.println(num1+"/"+num2+"="+div(num1,num2));
		}
		else
		{
			System.out.println("사용할 수 없는 연산자 입니다");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
