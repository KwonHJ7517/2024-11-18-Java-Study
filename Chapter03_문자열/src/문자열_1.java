/* 
 *  String 클래스 => char[]을 제어
 *  => 문자여러개 저장하는 공간
 *     ------- 문자열 : "" char => ''
 *  => 문자열을 저장하는 일반데이터 / 기능(메소드)을 가지고 있는 클래스형
 *  => 웹 / 윈도우 => 자바로 만들 수 있는 모든 프로그램의 핵심
 *    => 오라클 : varchar2 / clob , MySql : varcahr,text
 *    => C/C++ : 문자열이 없다 => char[] , char*를 사용
 *  => 문자열 저장하는 방법
 *     String name="홍길동"
 *     ------ ----
 *     데이터형 변수명
 *  => 클래스형으로 저장하는 방법
 *     String name=new String("");
 *  => String에서 지원하는 기능 (메소드)
 *     # 메서드
 *       리턴형(처리 결과값) 메소드명(매개변수)
 *       -------------  ----- ------
 *       데이터형           ㅣ기능  ㅣ 어떤 값을 첨부
 *       {
 *           요청처리
 *           결과값 전송
 *       }
 *       리턴형 : 결과값 1개
 *       매개변수 : 없는 경우 / 한개인 경우 / 여러개
 *                                   ---- substring(1,4)
 *               random()  substring(1)
 *               langth()
 *       메소드 : 라이브러리 => 이미 만들어져 있는 상태
 *              *** 사용자 정의 => 직접 만들어서 처리
 *                  --------- 조립
 *       *** 객체지향 프로그램 : 변수/메소드
 *       ---------------------------
 *     String에서 사용하는 메소드
 *     1) length() : 문자의 갯수 (한글/알파벳) => 동일
 *                    * 알파벳 => 저장시 1byte : ASC/Unicode
 *                    * 한글 => 저장시 2byte : Unicode
 *                      => UTF-8
 *        ----------------------------------------------
 *          원형
 *            int length()
 *            
 *            => int len=length()
 *            => long / float / double
 *            => 받는 경우에는 데이터형이 같거나 큰 데이터형으로 받는다
 *            => 작은 데이터형으로 받아야 할 경우
 *               -----------------------
 *                 => 형변환을 해서 사용한다
 *              String word="홍길동";
 *              byte len=(byte)word.length()
 *        ----------------------------------------------
 *        예)
 *               String word="홍길동";
 *               int len=word.length(); - word 안에 있는 글자의 갯수
 *               => len=3
 *               => 비밀번호 글자수 , 입력여부 확인
 *                  if(word.length()<1) => 입력이 안된 상태
 *               => 유효성 검사
 *     2) charAt => 원하는 위치의 문자 한개를 추출
 *        -------------------------------
 *         원형)
 *             char charAt(int index)
 *              ㅣ               ㅣ
 *              결과값           매개변수 ==> index 번호에 해당되는 문자를 추출요청 
 *        -------------------------------
 *        문자열 저장
 *        String msg="Hello Java";
 *        
 *        -----------------------------------
 *         'H' 'e' 'l' 'l' 'o' ' ' J' 'a' 'v' 'a'
 *        -----------------------------------
 *          0   1   2   3   4   5  6   7   8   9
 *          charAt(3) ==> 'l' => 인덱스번호는 0부터 시작
 *                               ---------------- 배열 (문자열)
 *                                                char[]
 *                                                
 *       예)
 *          String msg="Hello Java";
 *          char c=msg.charAt(6) ==> 'J'
 *          String => 저장할 수 있는 문자의 갯수는 제한이 없다
 *            => 줄거리 / 회사소개
 *    3) indexOf => 지정된 문자나 문자열의 인덱스번호를 찾아주는 역할
 *       => 웹 (MVC)
 *       => 브라우저에서 실행되는 언어
 *          ------------------ 자바가 아니다 HTML
 *      ---------------------------------------
 *      원형)
 *          => 오버로딩 기법 (중복메소드 선언)
 *             => 새로운 기능을 추가
 *          int indexOf(char c)
 *          int indexOf(String s)
 *      ---------------------------------------
 *      
 *      String msg="Hello Java";
 *      int index=msg.indexOf('J')
 *          index=6
 *      int index=msg.indexOf('k')
 *          index=-1
 *      문자열을 찾는 경우에는 첫번째 문자의 인덱스번호 추출
 *      => 대소문자를 구분한다
 *      => indexOf는 앞자리부터 요청된 문자의 인덱스 번호 추출
 *   4) lastIndexOf : 요청된 문자의 인덱스 번호를 뒷자리부터 추출한다
 *      -------------------------------------------
 *       원형
 *         int lastIndexOf(char c)
 *         int lastIndexOf(String s)
 *         => URL / 파일경로 / 확장자
 *         
 *         예) String msg="Hello Java"
 *            int len=msg.indexOf('a'); => 7
 *            int len=msg.lastIndexOf('a'); => 9
 *      -------------------------------------------
 *    5) 검색 관련
 *       contains() : 포함 문자 => (오라클에선 %검색어%)
 *       => 일반 검색기
 *       --------------------------------------------
 *        원형)
 *            boolean contains(String s)
 *                              -------
 *                              포함된 문자
 *                              ㅣ 포함된 경우 : true
 *                              ㅣ 포함이 안된 경우 : false
 *             => 사용되는 제어문 : if
 *             => 정규식
 *             // 제목 / 내용 / 가수명 / 출연진 등등등
 *       --------------------------------------------
 *    6) 서제스트 : 자동 완성기
 *         => 네이버 or 구글 => 완성기를 가져온다 => 쿠키
 *       ----------------                   ---- 타겟형 광고
 *       startsWith / endsWith
 *          ㅣ
 *          시작하는 문자열이 같른 경우 => 자음(오라클 => Procedure)
 *          
 *          ----------------------------------------------
 *           원형)
 *               ***boolean startsWith(String s)
 *                                     -------- 문자열 시작
 *               *** ()안에 공백이 있는 경우 trim().를 사용하면 공백을 무시한다
 *               
 *               boolean endsWith(String s)
 *                                -------- 문자열 끝
 *          ----------------------------------------------
 *       7) 변환
 *          replace() => 문자/문자열 변환
 *          ----------------------------------------------
 *           원형
 *              String replace(char old.char new)
 *              String replace(String old,String new)
 *          ----------------------------------------------
 *              String msg="Hello Jva"; => 원본은 유지됨
 *              String s=msg.replace('a','b'); => a를 b로 바꿔라
 *              s="Hello Jbvb"
 *              String s=msg.replace("Java","Oracle");
 *              s="Hello Oracle"
 *              
 *          replaceAll() => 전체 변경
 *          ----------------------------------------------
 *            String replaceAll(String regex,String s)
 *                              ------------
 *                              패턴을 적용해서 변경
 *                              --------
 *                              정규식
 *            => [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
 *               ip
 *          ----------------------------------------------
 *          
 *    8) trim() : 좌우의 공백만 제거
 *       -------------------------------------------------
 *         => 입력여부 => 데이터를 자르는 경우에 (좌,우 끝부터 있는)공백을 제거(문자 사이 공백은 제거하지 않음)
 *          원형)
 *          String trim()
 *          
 *          String msg=" Hello Java ";
 *          Stirng s=msg.trim()
 *            => s="Hello Java"
 *       -------------------------------------------------
 *       
 *    9) toUpperCase() : 대문자 변환
 *       toLowerCase() : 소문자 변환
 *       -------------------------------------------------
 *        원형)
 *                  String toUpperCase()
 *                  String toLowerCase()
 *                  
 *                  
 *        예)
 *           String msg="Java";
 *           String s=msg.toUpperCase()
 *                  s="JAVA"
 *           String s=msg.toLowerCase()
 *                  s="java"
 *         ------------------------------------------------
 *         
 *    10) valueOf() => 모든 데이터형을 문자열로 변환
 *        ------------------------------------------------
 *         원형)
 *         		 중복메소드 정의 => 메소드명이 동일
 *               String valueOf(int i)
 *               String valueOf(char i)
 *               String valueOf(boolean i)
 *               String valueOf(double i)
 *               String valueOf(float i)
 *               String valueOf(byte i)
 *               String valueOf(char[] i)
 *               = static으로 제작 => 공통적인
 *                 ------ 변수 선언 없이 클래스명으로 접근이 가능
 *                 String.valueOf()
 *                 => Math.random()
 *                 Scanner sc=new
 *         ------------------------------------------------
 *   11) substring() : 문자열 자르기
 *       ------------------------------
 *        원형)
 *            String substring(int begin)
 *               begin부터 마지막 문자열까지 자르기
 *               예)
 *                  String s="aaa.java";
 *                  String ext=s.substring(4); => java
 *            String substring(int begin,int end)
 *                  String s="Hello Java";
 *                  => 중간에 자르는 경우 (어디서 어디까지)
 *                  => s.substring(2,5); => llo
 *                                   -- 미포함
 *                                   => end -1
 *       ------------------------------
 *   12) split() : 단어별 구분
 *       ------------------------------
 *        원형)
 *            String[] split(String regex)
 *            ==> 1|제목|출연|상영일...
 *       ------------------------------
 *   13) format() : 변환
 *       ------------------------------
 *        원형)
 *            String format(String s,Object obj...)
 *            //가변 매개변수 => 원하는 갯수만큼 사용이 가능
 *            format("%d %d %d",10,20,30)
 *            => %.2f
 *       ------------------------------
 *   14) equals() : == (저장된 문자열을 비교)
 *       ------------------------------
 *        원형)
 *        
 *           boolean equals(String s)
 *           => 로그인처리 , 아이디찾기 ...
 *       ------------------------------    
 */
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String m="Hello Java";
		//char c=m.charAt(0);
		//int a=m.indexOf(' ');
		//System.out.println("첫번째 글자 이름:"+c);
		//System.out.println("공백의 자리 숫자:"+a);
		
		/*if(m.contains("va"))
		{
			System.out.println("포함되어 있습니다");
		}
		else
		{
			System.out.println("포함되지 않은 문자입니다");
		}*/
		/*String msg=" Hello Java";
		if(msg.trim().startsWith("Hello")) // trim(). 은 공백을 제외하고 불러오는 기능
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}*/
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println(String.valueOf(a)+String.valueOf(b));
	}

}
