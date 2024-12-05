import java.util.Scanner;
public class 메소드문제4 {
	static String div(int a,int b)
	{
		String result="";
		if(b==0)
			result="0으로 나눌 수 없습니다";
		else
			result=String.valueOf(a/(double)b);
		
		return result; // 리턴형에 선언된 데이터형과 일치
	}
	static void process()
	{
		//main
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		System.out.print("연산자 입력:");
		String op=scan.next();
	if(op.equals("/"))
	{
		System.out.println(num1+"/"+num2+"="+div(num1,num2));
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
