/*
 *  선택문 switch(정수/문자/문자열)
 *  
 *   switch
 *   {
 *     case 값: 값 => 정수 1 2 , 문자 => '+' , 문자열 => ""
 *        실행 문장
 *        break; => 종료
 *     case 값:... 순서가 없다 , 중복된 값은 사용할 수 없다
 *     default: 생략이 가능 , 필요시에만 사용
 *    }
 *    ** 실행하면 자동으로 case로 부터 ~ break가 있는 곳까지 출력
 *    int no=3;
 *    switch(no)
 *    {
 *      case 1:
 *        문장 1
 *      case 2:
 *        문장 2
 *      case 3: ==> 출력 시작 위치 => 문장 3,4,5 출력
 *        문장 3
 *      case 4:
 *        문장 4
 *        break; => 여기서 종료된다
 *      default:
 *        문장 5           
 *     }
 *     => 다중조건문을 간결하게 표현
 *     => 범위 지정이 많다 => 다중 조건문
 */
import java.util.Scanner;
public class 첫번째문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int score=scan.nextInt();
		switch(score/10)
		{
		case 10: case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점입니다");
		}
	}
}