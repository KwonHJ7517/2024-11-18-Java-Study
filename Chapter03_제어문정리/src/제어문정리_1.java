/* 
 *  자바에서 제공하는 제어문
 *  = 조건문
 *    형식)
 *        단일 조건문 => 독립적으로 처리
 *        if(조건문) 조건문 : true / false
 *                        ============= 부정연산자 / 논리연산자 / 비교연산자
 *        {
 *           조건이 true 일때만 처리 => false 일때는 수행하지 않는다
 *        }
 *        선택 조건문 => true/false 를 나눠서 처리
 *         *** 웹에서 가장 많이 사용되는 조건문
 *         *** 조건문 만드는 연습
 *         *** 기본 사이트 제작 => JSP(MVC) / Spring / Spring-Boot
 *             => Django
 *        if(조건문) => 로그인 된 경우
 *        {
 *         조건이 true 일때 처리
 *        }
 *        else => 로그인 실패
 *        {
 *         조건이 false 일때 처리
 *        }
 *        
 *        다중조건문 : 조건을 여러개 사용 => 해당 조건만 출력
 *                  => 메뉴 / 화면을 찾기
 *        if(조건문)
 *        {
 *          조건이 true일때 처리문장 => 수행종료
 *          main.jsp로 이동...
 *        }        ㅣ false면 다음 조건을 찾는다
 *        else if(조건문) page=2
 *        {
 *          예약화면...
 *        }
 *        else if(조건문)
 *        {
 *        }
 *        else
 *        {
 *        }
 *  = 선택문
 *    switch(정수/문자/문자열)
 *           => 문자 ==> '' => char
 *           => 문자열 ==> "" => String
 *           ** 윈도우 / 웹 => 송수신하는 모든 데이터는 String
 *           => 다른 데이터형이 필요할때는 변경 (String)
 *           => Integer.parseInt("10") => 10
 *              Double.parseDouble("5.0") => 5.0
 *              Byte / Boolean => Wrapper
 *           => char[] => 제어 => String
 *     switch(정수/문자/문자열)
 *     {
 *       case 값1:
 *          수행문장
 *          break;
 *       case 값2:
 *          수행문장
 *          break;
 *       default:
 *          수행문장      
 *     }
 *     => 무조건 break 를 사용하는 것은 아니다
 *        => 같은 수행문장을 수행할때는 break를 사용하지 않는다
 *        case 10: case 9: => 점수==10 || 점수==9
 *            score='A';
 *     => case에 중복된 데이터는 사용할 수 없다
 *     => 다중 조건문으로 변경이 가능       
 *  = 반복문 => 중복제거
 *    = for : 횟수가 지정된 경우 => 웹 화면 UI
 *                 ㅣ false 면 종료
 *           1     2    4 => 증가된 값이 조건에 해당 여부
 *      for(초기값;조건식;증가식)
 *      {         ㅣ true
 *         반복 수행문장
 *      }
 *    = while : 횟수가 지정이 안된 상태 => 데이터베이스
 *      => 먼저 조건을 검색 => 한번도 실행이 안되는 경우도 있다
 *    = do~while : while 문과 동일 => 후조건 검색
 *                 무조건 한번 이상 수행
 *      초기값 ---------1
 *      do
 *      {
 *        반복수행문장 -- 2=> 무조건 문장한번 수행
 *        증가식 ------ 3
 *      }while(조건식); -4
 *              ㅣ false 면 종료
 *    = 반복제어문장
 *       =break : 반복을 종료시에 사용
 *                for,while,do~while => 무조건 종료
 *       =continue : 특정부분을 제외시에 사용
 *                 for ==> 증가식으로 이동
 *                 while ==> 조건식으로 이동 => 무한루프
 *       *** 소속 반복문만 제어
 *       
 *         for()
 *         {
 *             for()
 *             {
 *               break
 *             }
 *         }   
 *         *** 사용빈도는 거의 없다
 *         outer:for()
 *         {
 *             for()
 *             {
 *               break outer;
 *             }
 *         }
 *         
 *         ★☆☆☆★
 *         ☆★☆★☆
 *         ☆☆★☆☆
 *         ☆★☆★☆
 *         ★☆☆☆★
 *         
 */
public class 제어문정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		if((i==j) ||(6-i==j))
        		{
        			System.out.print("★");
        	    }
        	else
        	{
        		System.out.print("☆");
        	}
        }System.out.println();
	}

	}
}
