import java.util.Arrays;
public class Chh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char[] alpha = {'a', 'b', 'c', 'd'};

		for(char i=0;i<alpha.length;i++)
		     System.out.print(alpha[i]);*/ //3번문제
				int[] arr= {10,20,30,50,3,60,-3};
				for(int i=0;i<arr.length;i++)
				{
					arr[i]=i++;
				}
				for(int i:arr)
				{
					System.out.print(i+" ");
				}
				System.out.println();
				int index=0;
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]==60)
					{
						index=i;
						break;
					}
				}System.out.println("60의 위치: "+(index+1)); //9번 문제
	}
}