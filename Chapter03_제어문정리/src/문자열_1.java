/*
 *   문자열 => 시을 (메소드) => 반드시 결과값 (리턴형/반환형)
 *   => int scan.nextInt()-메소드
 *   
 *   => String : 문자열을 저장하는 데이터형
 *               ------------------- 제한이 없다
 *               일반 데이터형으로도 사용 / 클래스형으로 사용이 가능
 *     문자열 변수 선언
 *     = String name="홍길동"; ** 더 많이 사용하는 편
 *     = String name=new String("홍길동") => 새로운 메모리 공간에 저장
 *   => 기능 (메소드)
 *      => 문자열은 비교연산자를 사용하지 않는다
 *      문자열 기능
 *      --------
 *      1) 비교 기능
 *         ***equals() => ==
 *         => 로그인 처리 => ID / PWD
 *         ***contains() => 포함문제 => 검색
 *         -------------
 *         ***startsWith()
 *         ***endsWith()
 *         ------------- 자동완성기 / 서제스트
 *      2) 글자 변경
 *      3) 문자열 분해
 *      4) 제어
 */
// 사용자의 입력값을 받아서 => ID / PWD => 로그인 처리
import java.util.Scanner;
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final String ID="admin";
        final String PWD="1234"; // 고정 => 상수
        
        Scanner scan=new Scanner(System.in);
        // equals => 같으면 true / 다르면 false
        while(true) // 무한루프
        {
        	System.out.print("ID를 입력하시오:");
        	String id=scan.next();
        	System.out.print("PASSWARD를 입력하시오:");
        	String pwd=scan.next();
        	// Scanner => 정수:nextInt()
        	// 문자열 : next()
        	// 실수 : nextDouble()
        	// 논리 : nextBoolean()
        	// String => 변경이 불가능 => 확장할 수 없다 => 제공한 내용만 사용
        	// => 표준화
        	// 변수 => 대소문자 구분
        	/*
        	 * 
        	 *   equalsIgnoreCase => 대소문자 구분없이 비교 => 검색할때
        	 *   equals => 대소문자 구분 => 로그인 할때
        	 *   ----------------------------------------------
        	 *   문자열 비교 ( == )
        	 *   
        	 *   반대 효과 => 조건문 시작점 !를 넣는다
        	 */
        	if(ID.equals(id) && PWD.equals(pwd))
        	{
        		System.out.println("로그인되었습니다");
        		System.out.println("메인 페이지로 이동합니다");
        		break; // while 문 종료
        	}
        	else
        	{
        		System.out.println("ID나 Passward가 틀립니다");
        		System.out.println("다시 입력하시오");
        	}
        }
	}

}
