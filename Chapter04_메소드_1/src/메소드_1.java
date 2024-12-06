/*
 *    1. 객체지향 프로그램 
 *    자동 생성
 *    ------
 *    import java.lang.*; => String , System....
 *    => 메소드 : void 일 경우에 생략을 하면 자동 첨부
 *    
 *    메소드는 반드시 호출을 해야 사용이 가능
 *    void display()
 *    int display()
 *    int display(int a)
 *    void diplay(int a,int b)
 *    
 *    호출하는 방법
 *    public static void main(String[] arg)
 *    {
 *         display();
 *         
 *         int a=display();
 *         
 *         int a =display(10);
 *         
 *         display(10,20);
 *    }
 */
public class 메소드_1 {
	// 4) 리턴형 / 매개변수가 없는 경우
	// => 메소드안에서 구구단을 출력
	static void gugudan()
	{
		// void => 메소드안에서 출력 => 전체 처리를 한다
		for(int i=1;i<=9;i++)// 줄수
		{
			for(int j=2;j<=9;j++)// 단출력
			{
				System.out.printf("%2d*%2d=%2d\t",j,i,j*i);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan(); // 메소드 호출
		return; // 컴파일시에 return이 없는 경우에는 자동으로 생성
		// return => 메소드 종료
	}

}
