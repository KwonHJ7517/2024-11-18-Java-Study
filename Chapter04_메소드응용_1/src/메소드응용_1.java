/*
 *     숫자 야구게임 => 절차적언어 (main) 
 *               => 메소드형식 변환
 *               => 객체지향 프로그램으로 변환
 *      
 *     1. 3개 정추 추출 => 1~9 => 중복없는 정수
 *     2. 사용자 입력
 *     3. 난수 입력 값 비교
 *     4. 힌트 => 문자열 1S-2B...
 *        S: ㅇ
 *        B: ㅇㅇ
 *     5. 종료 여부 확인
 */
import java.util.Arrays;
import java.util.Scanner;
public class 메소드응용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 중복없는 난수 => 3개 정수 (1~9)
		int[] com=new int[3]; // 3개의 정수를 저장하는 공간
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				//중복되어 있는지 검사
				if(com[i]==com[j])
				{
					i--;//같은 정수가 있으면 다시 난수 발생
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(com));
		int[] user=new int[3];//2.사용자 입력
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력하시오:");
			int input=scan.nextInt();
			
			//오류 처리
			if(input<100 || input>999)
			{
				System.out.println("세자리 정수만 입력됩니다");
				//처음으로 이동
				continue;
				// continue 사용시 for 문은 증가식으로 이동 while 문은 조건식으로 이동
			}
			// 3자리 정수를 잘라서 배열에 저장
			user[0]=input/100; //ex 369입력 369/100 => 3
			user[1]=(input%100)/10; //ex 369 입력 369%100 => 69/10
			user[2]=input%10;
			
			// 오류 처리 ==> 중복된 수가 없어야 함, 0을 사용하면 안됌
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("중복된 숫자는 사용할 수 없습니다");
				//처음으로 이동
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용할 수 없습니다");
				continue;
			}
			
			//비교
			int s=0,b=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[j])//같은 숫자가 있다면
					{
						if(i==j)//같은 자리수
							s++;
						else
							b++;
					}
				}
			}
			//힌트 제공
			System.out.println("Unput Number:"+input);
			System.out.println("======전광판======");
			System.out.print("S:");
			for(int i=0;i<s;i++)
			{
				System.out.print("●");
			}
			System.out.println();
			System.out.print("B:");
			for(int i=0;i<b;i++)
			{
				System.out.print("○");
			}
			System.out.println("\n===============");
			//System.out.printf("Input Number:%d,Result:%dS-B");
			
			//종료여부 확인
			if(s==3)
			{
				System.out.println("Game over");
				break;// 루프 중단
			}
		}
	}

}
