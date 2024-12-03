package 제어문문제_2;

public class 삼번문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======1~100 사이의 4와7의배수======");
        int i=1;
        int j=1;
        while(i<=100)
        {
        	if(i%4==0)
        	System.out.println(i);
        	i++;
        		
        }
        while(j<=100)
        {
        	if(j%7==0)
        		System.out.println(j);
        	j++;
        }
	}

}
