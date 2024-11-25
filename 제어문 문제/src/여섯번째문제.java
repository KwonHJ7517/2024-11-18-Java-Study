import java.util.Scanner;
public class 여섯번째문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("정수 입력:");
        int sum=0;
        int num=scan.nextInt();
        for(int i=1;i<=num;i++)
        {
        	sum+=i;
        }
        System.out.println("sum="+sum);
	}

}
