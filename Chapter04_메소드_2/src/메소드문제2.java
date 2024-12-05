
public class 메소드문제2 {
	static void print()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	static int print2()
	{
		int num=0;
		for(int i=1;i<=10;i++)
		{
			num+=i;
		}
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		int total=print2();
		System.out.println();
		System.out.println("1~10까지 합:"+total);
	}

}
