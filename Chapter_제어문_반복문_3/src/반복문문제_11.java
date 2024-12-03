
public class 반복문문제_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0;
        for(int i=1;i<=10;i++)
        {
        	int num=(int)(Math.random()*100)+1;
        	System.out.print(num+" ");
        	if(num%2==0)
        		count++;
        }
        System.out.println("count="+count);
	}

}
