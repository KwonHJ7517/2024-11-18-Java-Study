// 1. 대소문자가 있는 문자열을 입력받아서
// 대문자는 소문자로 소문자는 대문자로 변경
// 예) abdDeF ==> ABDdEf
// 2. 문자열을 입력받아서 역순으로 출력하는 프로그램 작성
// 예) abcde => edcba
import java.util.Scanner;
public class 문자열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열 입력:");
		String msg=sc.next();
		/*System.out.println("변경 전:"+msg);
		String ch="";
		for(int i=0;i<msg.length();i++)
		{
			char c=msg.charAt(i);
			if(c<='A' && c<='Z')
			{
				ch+=Character.toLowerCase(c);
			}
			else if(c>-'a' && c<='z')
				ch+=Character.toUpperCase(c);
		}
		System.out.println("변경 후:"+ch);*/ // 1번
		
		for(int i=msg.length()-1;i>=0;i--)
		{
			System.out.print(msg.charAt(i));
		} //2번
				
	}

}
