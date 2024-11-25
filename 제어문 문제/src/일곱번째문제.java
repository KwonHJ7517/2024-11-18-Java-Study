
public class 일곱번째문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=30;i++)
        {
        	if(i%2==0)
        	{
        		System.out.printf("%-2d\t",i); // +오른쪽 정렬 -왼쪽 정렬
        		if(i%3==0) // 3개를 출력하고 다음 줄에 출력한다
        			System.out.println();
        	}
        }
	}

}