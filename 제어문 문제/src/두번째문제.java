import java.util.Scanner;
public class 두번째문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num1=scan.nextInt();
		System.out.print("정수 입력:");
		int num2=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/):");
		switch(scan.next())
		{
		 case "+":
			 System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			 break;
		 case "-":
			 System.out.println(num1+num2+"-"+num2+"="+(num1-num2));
			 break;
		 case "*":
			 System.out.println(num1+num2+"*"+num2+"="+(num1*num2)+"\n");
			 break;
		 case "/":
			 if(num2==0)
				 System.out.println("0으로 나눌 수 없습니다");
			 else
				 System.out.println(num1+"/"+num2+"="+(num1/(double)num2));
			 break;
	}

}
}
