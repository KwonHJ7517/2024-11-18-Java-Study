import java.util.Arrays;

public class 문자열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char[] arr=new char[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65); // 알파벳이 26개니까 곱하고 대문자는 +65대입 / 소문자 +97
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("앞의 알파벳 정렬:");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length+1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("뒤의 알파벳 정렬:");
		System.out.println(Arrays.toString(arr));*/ // 7번문제
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=(int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));


	}
}