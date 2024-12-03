
public class 반복문문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int cnt3=0,cnt5=0;
        for(int i=0;i<10;i++)
        {
        	int num=(int)(Math.random()*100)+1;
        	System.out.print(num+" ");
        	if(num%3==0)
        		cnt3++;
        	if(num%5==0)
        		cnt5++;
        }
        System.out.println("\n3의배수 갯수:"+cnt3);
        System.out.println("5의배수 갯수:"+cnt5);
	}

}
