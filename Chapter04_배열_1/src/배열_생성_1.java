// 가급적 같은 기능의 변수가 3개 이상이면 배열을 사용한다
//      다른 기능의 변수가 3개 이상이면 클래스를 사용한다
/*
 *    int kor1,kor2,kor3; int[3] kor
 *    int eng1,eng2,eng3;
 *    
 *    변수 여러개 => 일차원 배열
 *                ===> 이차원 배열
 *                     ====> 삼차원 배열
 *    =====================================
 *    1. 배열 생성
 *       배열 : 연속적인 메모리 구조를 가지고 있다
 *             ---------- 번호
 *       인덱스 : 항상 0부터 순차적으로
 *                  ==========
 *                  for (int i=0;i<8;i++)
 *       배열 선언
 *          데이터형[] 배열명; => 권장
 *          데이터형 배열명[]; => C/C++ 호환
 *       배열 초기화   => 데이터를 메모리에 저장 : 저장하는 값
 *       								--------- 초기화
 *       1) 정수형
 *           int[] arr=(1,2,3,4,5);
 *                 ----------------- 5개의 메모리공간을 연속적으로 배치
 *           int[] arr=new int[5];
 *                     ----------- 자동 초기화
 *                        int => 0
 *                        int => 0L
 *                        char => *\
 *           
 *       [I@5ccd43c2배열 주소
 *       int[] arr
 *       ---------
 *       주소를 참조 데이터 관리 => 참조변수
 *       stack공간에 저장          실제 데이터 저장 공간(Heap)
 *          arr
 *       ---------             -------------------------
 *       [I@5ccd43c2            0  |  0  |  0  |  0  |  0
 *       ---------             -------------------------
 *                             arr[0] [1] [2] [3]  [4]
 *                             => 인덱스번호
 *                             
 *                             arr[0] arr[1]  arr[2] ...
 *                             arr+0*4 arr1*4  arr+2*4
 *                             100      104     108
 *                             long => *8
 *                             double => *8
 *                             char => *2
 *      int a=10 ==> arr[0](변수)
 *      arr[0]=10;
 *      arr[1]=100;
 *      
 *      	=> 연속적으로 메모리 구조
 *             ------------
 *             인덱스번호를 이용해서 접근
 *             1. 배치 => 인덱스 번호 부여 (0부터 요청한 갯수만큼 배치)
 *             2. 인덱스 번호를 이용해서 데이터 값 수정 / 값 읽기 / 값 첨부
 *             3. 0부터 순차적이기 때문에 => 반복문으로 처리가 가능
 *             
 *           => 종류
 *              1. 정수 : int[] 배열명
 *              2. char : char[] 배열명
 *              3. 실수 : double[] 배열명
 *              4. 논리형 : boolean[] 배열명
 *              5. 문자열 : String[] 배열명
 *           => 생성
 *              new 데이터형[배열크기]
 *                        ======> 고정적 메모리
 *              new int[5] => 정수를 저장할 수 잇는 공강 5개를 모아라
 *                ---------------------------------
 *                     |     |     |     |     |
 *                ---------------------------------
 *              =>
 *                 [0]   [1]   [2]   [3]   [4]
 *                 ---------------------------------
 *                  0   | 0  | 0  |  0  | 0  |
 *                ---------------------------------
 *                ===========20 byte===============
 *                => 배열의 갯수 확인 => 배열명.length
 *                                   -----------
 *                데이터형[] 배열명
 *                -------- ---
 *                | => 배열에 저장되는 데이터의 종류
 *                     ex)점수 : 정수형 , 이름: String , 평균: double
 *                        학점 : char , 통계 : long , 예약여부 : boolean
 *                [] => 배열기호
 *                [0] =>
 *                --- 배열 인덱스 => 저장 위치
 *                    배열 첨자
 *                배열명 : 실제 저장되어 있는 주소를 참조 => 참조 변수
 *                
 *            => 가장 많이 사용되는 배열 생성
 *               => 데이터형[] 배열명=new 데이터형[배열갯수지정]
 *                                          --------
 *                                => 데이터 접근 : 배열명.length-1
 *                                => 배열의 인덱스를 벗어나면
 *                                ArrayIndexOutOfBoundsException
 */
public class 배열_생성_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언
		int[] arr=new int[5];
		// 배열값 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		//실제값을 확인
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}
		System.out.println("===배열값 출력===");
		/*
		 *    => 출력용으로 사용 => for-each : 향상된 for문
		 *    for(데이터형 변수 : 배열명(컬렉션)) => 92page
		 *                    ----------- 배열/컬렉션만 사용가능
		 *    {   -----       --- 배열에 선언된 데이터형과 동일
		 *         | 인덱스를 이용하지 않는다 => 실제 저장된 값을 순차적으로
		 *         | 마지막 값을 읽어오면 자동 종료
		 *         | WEB의 Front의 핵심
		 *         | => 배열의 값을 변경 불가능 , 추가 불가능
		 *              ----------- 인덱스 번호
		 *     }
		 *     
		 *     int[] arr={1,2,3,4,5}
		 *       arr(stack)           Heap
		 *                          arr[0] [1] [2]  [3]  [4]
		 *     ---------            ----------------------
		 *     0x100                  1    2    3    4    5
		 *     ---------            ----------------------
		 *     
		 *                          arr변수 => 5개의 데이터를 제어
		 *       int[] arr={1,2,3,4,5}
		 *        | 동일하거나 큰데이터형을 사용
		 *       for(int(long,double) 받는변수 : arr)
		 *         => a=1
		 *         => a=2
		 *         => a=3
		 *         => a=4
		 *         => a=5
		 *         => 종료 => 인덱스를 이용하는 것이 아니라 실제로 저장된 값
		 */
	}

}
