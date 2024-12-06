/*
 *   중복없는 난수 => 3개 발생(1~9) 
 *   ========================
 *   사용자 입력
 *   3개 입력 => 맞추는 프로그램 : 숫자 야구게임
 *   힌트
 *   	3,6,9
 *   	1,2,3 => 0S-1B
 *   	3,4,6 => 1S-1B
 *   	==> 3S
 */
import java.util.Arrays; 
import java.util.Scanner;
public class 배열_생성_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 컴퓨터가 중복없는 난수 3자리 발생시키기
		int[]com=new int[3]; // 0 0 0
		// 2. 사용자 입력
		int[]user=new int[3]; // 0 0 0
		
		// 3. 초기화
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--; // 중복이 있기 때문에 난수 다시 발생시키기 위함
					break;
				}
				
			}
		}
		System.out.println(Arrays.toString(com));
		// 3. 난수와 사용자 입력 비교
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("세자리 수를 입력하세요:");
			int input=sc.nextInt();
			
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다");
				continue; // 처음으로 돌아가라
			}
			
			// 세자리 정수 입력 => 356/100 => 3
			user[0]=input/100; // 356/100 => 3
			user[1]=(input%100)/10; // (356/100)/10 => 10의 자리 추출
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("중복된 수는 사용할 수 없습니다");
				continue;
			}
			// 문제 발생 ==> 0을 제외
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용 할 수 없습니다");
				continue;
			}
			// 4. 힌트
			int s=0,b=0;
			for(int i=0;i<3;i++) // com
			{
				for(int j=0;j<3;j++) // user
				{
					if(com[i]==user[j]) // 같은 수가 있다면
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			System.out.printf("Number:%d,Result:%dS-%B\n",input,s,b);
			if(s==3)
			{
				System.out.println("Game over");
				break;
			}
		}
		
		// 5. 종료여부 확인 => S=3
		
	}

}
