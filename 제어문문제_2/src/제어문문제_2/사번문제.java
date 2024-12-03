package 제어문문제_2;

public class 사번문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~100사이 일의 자리 수가 3,6,9인 수");
		int i=1;
        while(i<=100)
        {
        	if(i%10==3 || i%10==6 || i%10==9)
        	System.out.println(i);
        	i++;
        		
        }
	}

}
