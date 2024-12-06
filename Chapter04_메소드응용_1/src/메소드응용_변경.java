// 메소드형 숫자 야구게임
import java.util.Arrays; 
import java.util.Scanner;
public class 메소드응용_변경 { 
	// 중복없는 난수 (3개의 정수)
	static int[] rand()
	{
		int[] com=new int[3];
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
		return com;
	}
	// 사용자 입력 => 유효성 검사까지
	static int[] userInput()
	{
		int[] user=new int[3];
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
		break;
	}
		return user;
}
	//비교
	static int compare(int[] com,int[] user)
	{
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
	hint(s,b,user);
	return s;
}
	// 힌트 제공
	static void hint(int s,int b,int[] user)
	{
		System.out.println("Input Number:"+user[0]+" "+user[1]+" "+user[2]+" ");
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
	}
	// 종료 여부 확인
	static boolean isEnd(int s)
	{
		boolean bCheck=false;
		if(s==3)
		{
			bCheck=true;
		}
		return bCheck;
	}
	// 전체 조립 => 게임 재시작 여부 확인
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		int[] com=rand();
		//System.out.println(Arrays.toString(com));
		int[] user=new int[3];
		while(true)
		{
			user=userInput();
			int s=compare(com, user);
			if(isEnd(s))
			{
				System.out.print("Continue?(y/n):");
				char c=scan.next().charAt(0);
				if(c=='y'||c=='Y')
				{
					System.out.println("New Game in");
					process();
				}
				else
				{
					System.out.println("Game out");
					System.exit(0); // 프로그램 종료
				}
			}
		}
		//System.out.println(Arrays.toString(user));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
