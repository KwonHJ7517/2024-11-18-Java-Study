/*  68page
 *  웹개발 ==> 데이터베이스 (SQL)
 *  = server 단 : Back => 자바 / 스프링 / 데이터베이스
 *  = db 단 : DBA
 *  = view 단 : Front => 자바스크립트
 *                       Jquery => VueJS => React => Next
 *                       ------ 4,5 동시에 출시
 *             MSA / DevOps / AWS
 *             자바/파이썬 => 데이터분석 (Numpy,Pandas,Matplotlib)
 *                         => DJango <==> Spring
 *                         => ElasticSearch : NoSQL
 *                            ------------- google
 *                         => 코딩테스트
 *             --- Full Stack
 *                                   
 *  조건문 : **단일조건문 / **선택조건문 / 다중조건문
 *         형식) 단일 조건문 => 독릭문장
 *         if(조건문) => 조건(부정,비교,논리연산자)
 *         {
 *            조건이 true일때 수행 => false면 건너뛴다
 *         }
 *         => 오류처리 => 8장 예외처리
 *         => 비정상 종료를 방지하고 프로그램을 유지
 *         => if : 유효성 검사
 *         선택 조건문 => true일때 false일때 처리를 나눠서 처리
 *         
 *         if(조건문)
 *         {
 *            조건이 true일때 처리
 *         }
 *         else
 *         {
 *            조건이 false일때 처리
 *         }
 *         웹 => 무조건 결과값 전송
 *              아이디 중복 체크 / 우편번호 검색 / 로그인 / 회원가입
 *              
 *         다중조건문 : 1개의 조건만 수행
 *         => menu / 카테고리 선택
 *         if(조건문)
 *         {
 *            조건 true일때 수행 => 종료
 *                 ㅣ false일때 => 다음 조건으로 이동
 *         }
 *         else if(조건문)
 *         {
 *            조건 true일때 수행 => 종료
 *                 ㅣ false일때 => 다음 조건으로 이동
 *         }
 *         else if(조건문)
 *         {
 *            조건 true일때 수행 => 종료
 *                 ㅣ false일때 => 다음 조건으로 이동
 *         }
 *         else
 *         {
 *            해당 조건이 없는 경우 무조건 실행하는 문장
 *            => 생략이 가능하다
 *         }     
 *  선택문 : switch~case
 *         다중 조건문과 유사
 *         ======== 범위를 지정 , 값을 한개만 선택 (게임개발쪽)
 *         형식)
 *              1. case안에 중복된 값이 있으면 안된다
 *              2. deafult는 생략
 *              3. 문자 => ''
 *              4. 문자열 => ""
 *              switch(문자/정수/문자열)
 *              {
 *                 case 값1:
 *                    실행문장
 *                    break;
 *                 case 값2:
 *                    실행문장
 *                    break;
 *                default:
 *                     실행문장    
 *                    
 *  반복문 : **for / **while / do~while
 *           for : 반복 횟수가 지정된 경우 => 웹 (반복횟수)
 *                 => 화면 UI => 목록 / 슬라이드
 *                 => Front
 *           while : 반복횟수가 없는 경우
 *                 => 데이터베이스 / 파일 읽기
 *                 => Back
 *           do~while : 후조건 => 먼저 반복문장을 1번 수행
 *                      => 반드시 한번 이상 수행
 *           형식)
 *                for        ㅣ false => 반복종료
 *                      1    2    4
 *                for(초기식;조건식;증감식)
 *                {          ㅣ true
 *                     반복 수행문장 3
 *                }
 *                초기식은 한번 수행
 *                조건식 => false까지
 *                증가식은 조건식에 있는 변수를 변경 => false 가 되게 만든다
 *                
 *                => 무한루프 : for(;;)
 *                
 *                => for(여기부터 시작;여기까지 도달;증가/감소)
 *                                            -------
 *                                             ++ , --
 *                                             += , -=
 *                -------------------------------------
 *                
 *                68page => 중첩 for (이중  for)
 *                형식)            ㅣ false면 종료
 *                           1    2
 *                     for(초기식;조건식;증감식) => 세로 => 줄수
 *                     {          ㅣ true 일때
 *                             1     2 ㅣ false 면 1차  for 증가식으로 이동   4
 *                        for(초기식;조건식;증감식) => 가로 
 *                        {          ㅣ true 일때
 *                                반복 수행문장 3
 *                           
 *                        }
 *                     }
 *                     
 *                     ★★★★★
 *                     ★★★★★
 *                     ★★★★★
 *                     ★★★★★
 *  반복제어문 : **break / continue
 *  
 */
/*
 *                     ★★★★★
 *                     ★★★★★
 *                     ★★★★★
 *                     ★★★★★
 */
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=4;i++) // 줄수
        {
        	for(int j=1;j<=5;j++) // 화면 출력
        	{
        		System.out.print("★");
        }
        System.out.println();
        }
	}
}
