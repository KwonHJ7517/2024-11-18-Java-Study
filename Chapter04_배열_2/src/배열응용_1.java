/*
 *	3명의 학생 
 *    => 국어/영어/수학점수를 입력받아
 *    => 총점/평균/학점/등수를 출력한다
 */
import java.util.Scanner;
public class 배열응용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] score=new char[3];
		int[] rank=new int[3];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<kor.length;i++)
		{
			System.out.print((i+1)+"국어 입력:");
			kor[i]=sc.nextInt();
			
			System.out.print((i+1)+"영어 입력:");
			eng[i]=sc.nextInt();
			
			System.out.print((i+1)+"수학 입력:");
			math[i]=sc.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			
			avg[i]=total[i]/3.0;
		}
		//학점 계산
		for(int i=0;i<kor.length;i++)
		{
			switch((int)((avg[i])/10))
			{
			case 10: case 9:
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='c';
				break;
			case 6:
				score[i]='d';
				break;
			default:
				score[i]='F';
				
			}
		}
		// 등수 계산
		for(int i=0;i<kor.length;i++)
		{
			rank[i]=1;
			for(int j=0;j<kor.length;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c%3d\n",kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
		}
	}

}
