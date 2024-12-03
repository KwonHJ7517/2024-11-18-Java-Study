
public class 반복문문제_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int even=0;
        for(int i=3;i<=4462;i++)
        {
        	if(i%2==0)
        		even+=i;
        }
        System.out.println("even="+even);
	}

}
