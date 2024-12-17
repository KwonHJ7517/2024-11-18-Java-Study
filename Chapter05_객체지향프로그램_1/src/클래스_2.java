// 클래스 제작 => 인스턴스와 정적변수 구분
/*
 *    클래스
 *     = 사용자 정의 데이터형 : 데이터를 모아서 전송 목적 , 데이터 관리
 *       배열의 단점을 보완 => 구조체 => 클래스로 대체
 *       => 변수 여러개를 모아서 관리 (관련된 변수를 모아서 저장)
 *       => 배열 => 고정적 , 같은 데이터형만..
 *       => 클래스 => 가변형 , 다른 데이터형을 모아서 관리
 *       => ~VO : Value Object => 값만 저장 => Spring
 *       => ~DTO : Data Transfor Object : 데이터를 모아서 전송
 *                              => 브라우저 , 윈도우 , 서버에 전송
 *     = 액션 클래스 : 변수+기능(메소드) => 기능
 *       => 메소드를 중심으로 함
 *       => ~DAO : 데이터베이스 연결과 처리 => 오라클 / MySQL
 *       => ~Manager , ~Service , Model
 *            |         | BI       | 브라우저 연동
 *            | 크롤링 / Map => OpenApi
 *       => 보안처리 => 벌금
 *          | 시큐어코딩
 *          
 *       = 변수
 *         => 데이터값을 따로 저장 => 인스턴스 변수
 *         => 한개의 메모리 공유 => 정적변수 , 공유 변수
 *         -----------------------------------
 *           static(o) 공유 , static(x) 저장
 *       => 클래스는 한개로 설계하여 저장을 여러개 사용
 *       
 *       class Card
 *       {
 *          char number; 'A','J','K','Q'
 *          String type;
 *          static int width;
 *          static int height;
 *       }
 *       
 */
class Card
{
	char number;//2byte = char
	String type;//4byte = String
	// new 를 이용해서 저장공간을 생성한 후에 사용 => 여러개 사용이 가능
	static int width;// no byte = static
	static int height;// |같음
	// 컴파일시에 자동 생성 => 저장 공간 한개만 사용 => 공유
}
public class 클래스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1=new Card();
		// 객체 => 정적인 상태 (데이터) => 명사형 => 변수
		// 객체 => 동적인 상태 (기능) => 동사형 => 메소드
		// 객체 => 변수+메소드
		// 객체 => 현실세계에 있는 모든 사물
		/*
		 *     1. 설계 => 관련된 데이터를 모아서 관리
		 *        class Student
		 *        {
		 *           int hakbun;
		 *           String name;
		 *           String subject;
		 *           int year;
		 *        }
		 *     2. 메모리 저장 => 설계된 데이터 저장
		 *        Student s1=new Student()
		 *     3. 활용 => 초기화 , 변경 , 불러오기
		 *        s1.hakbun=10;....
		 *     4. 객체 소멸 => 객체 종료
		 *        s1=null ==> GC 대상
		 *        => Syetem.gc()
		 *        -------------- 멀티미디어 , 화상채팅
		 *        
		 *     int[] kor=new int[3];
		 *     int[] eng=new int[3];
		 *     int[] math=new int[3];
		 *     int[] total=new int[3];
		 *     double[] avg=new double[3];
		 *     int[] rank=new int[3];
		 *     char[] score=new char[3];
		 *     ----------------------------- 변경 전
		 *     
		 *     class Student
		 *     {
		 *        int kor,eng,math,rank;
		 *        double avg;
		 *        char score;
		 *        ==> 클래스 전체 사용이 가능
		 *        ==> 전역변수
		 *        ==> 다른 클래스안에 사용이 가능
		 *     }
		 *     
		 *     학생 => 성적관리 시스템
		 *     
		 *     new Student() => 3번
		 */
		c1.number='A';
		c1.type="♡";
		c1.width=150;
		c1.height=180;
		System.out.println("c1안에 저장된 데이터 number:"+c1.number);
		System.out.println("c1안에 저장된 데이터 type:"+c1.type);
		System.out.println("c1안에 저장된 데이터 width:"+c1.width);
		System.out.println("c1안에 저장된 데이터 height:"+c1.height);
		System.out.println();
		
		Card c2=new Card();
		c2.number='2';
		c2.type="♣";
		c2.width=200;
		c2.height=250;
		System.out.println("c2안에 저장된 데이터 number:"+c2.number);
		System.out.println("c2안에 저장된 데이터 type:"+c2.type);
		System.out.println("c2안에 저장된 데이터 width:"+c2.width);
		System.out.println("c2안에 저장된 데이터 height:"+c2.height);
		
		System.out.println();
		System.out.println("c1안에 저장된 데이터 width:"+c1.width);
		System.out.println("c1안에 저장된 데이터 height:"+c1.height);
		
		// static => 객체명.변수명
		// --------> 클래스명.변수명
		Card.width=300;
		Card.height=350;
		// c1 , c2
		// Card => 6byte
		//System.out.println(c1);
		// c1 => number,type => 객체
		/*
		 *    객체 => 사용자 정의 클래스의 변수 => 어러개를 제어할 수 있다
		 *    --- 여러개 변수를 저장할 수 잇는 메모리 공간의 이름
		 *    --- 메모리 주소를 이용하는 프로그램 => 참조 변수
		 *                  Card@4aa8f0b4
		 *    ---c1---      --------------
		 *    Card@4aa8f0b4     '\0'      number
		 *    --------      --------------
		 *                       null     type
		 *                  --------------
		 *                     | 생성자 => 반드시 클래스명과 동일
		 *     Card@4aa8f0b4 메모리 안에 number 라는 메모리 접근
		 *     ------------- c1.number
		 *                   객체명.변수명
		 *                   .은 메모리 주소 접근 연산자
		 *                   scan.nextInt()
		 *     Card@4aa8f0b4 메모리 안에 type 라는 메모리 접근
		 *                   c2.type
		 */
	}

}
