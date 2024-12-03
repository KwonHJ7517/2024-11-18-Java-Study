//1.5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성
import java.util.Arrays;
import java.util.Scanner;
public class 배열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] kor=new int[5];
		int[] st=new int[5];
		for(int i=0;i<st.length;i++)
		{
			kor[i]=(int)(Math.random()*101);
		}
		for(int i=0;i<kor.length;i++)
		{
			st[i]=1;
			for(int j=0;j<kor.length;j++)
			if(kor[i]<kor[j])
			{
				st[i]++;
			}
			System.out.println("1등 학생:"+i);
		}
	}
	

}
