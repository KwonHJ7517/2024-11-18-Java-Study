package 제어문문제_2;
import java.util.Scanner;
public class 열번째문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i=1;
		int sum=0;
		String strMax="";
		int max=0;
		while(i<=3)
		{
			System.out.print("문자열 입력:");
			String str=scan.nextLine();
			sum+=str.length();
			if(max<str.length())
			{
				strMax=str;
			}
			i++;
		}
		System.out.println("총 문자열 길이:"+sum);
		System.out.println("긴 문자열 출력"+strMax);

	}

}
