import java.util.Arrays;
public class Ads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;	
		}
		System.out.println(Arrays.toString(arr));
		int a=0;
		for(int i:arr)
		{
			a+=i;
		}
		System.out.printf("평균:%.2f",a/10.0);
	}

}