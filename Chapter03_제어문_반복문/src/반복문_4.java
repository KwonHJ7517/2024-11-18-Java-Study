// 1~100까지의 합 - 67page
public class 반복문_4 {
    // 짝수합 , 홀수합, 총합
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0,even=0,odd=0;  // 누적변수 => 초기값은 0부터 시작 , 누적곱 => 초기값을 1부터 시작
        for(int i=1;i<=100;i++)
        {
        	sum+=i; // sum=sum+i
        	//System.out.println("sum="+sum+"i="+i);
        	if(i%2==0) // 짝수라면
        		even+=i;
        	else // 홀수라면
        		odd+=i;
        }
        
        System.out.println("1~100까지 사이의 총합:"+sum);
        System.out.println("1~100까지 사이의 짝수합:"+even);
        System.out.println("1~100까지 사이의 홀수합:"+odd);
        
	}

}
