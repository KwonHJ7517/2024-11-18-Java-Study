/* 
 *  break; ==> 사용하는 위치가 반복문,선택문 안에서 사용가능
 *             조건문에서는 사용 불가능
 *             ----
 *             for()
 *             {
 *              if()
 *              {
 *                break; => 사용가능
 *              }
 *             }
 *             if() => 단독사용하는 조건문에서 사용 불가
 *             {
 *               break;
 *             }
 *             
 *             ==> 반복문이 선택문을 종료할 때 사용하는 제어문
 *  continue; : 반복문에서만 사용이 가능
 *              조건문 / 선택문에서는 사용이 불가능
 *              => 특정부분을 제외할때 사용
 *              => for문에서는 증가식으로 이동
 *              => while문에서는 조건식으로 이동
 *  *** break,continue가 있는 경우에 다음에는 소스 코딩 불가
 *  
 *      for()
 *      {
 *         if()
 *         {
 *           // 소스코딩 가능
 *           break;
 *           // 소스코딩 불가능
 *          }
 *       }   
 */
public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=10;i++)
        {
        	if(i>=5)
        		continue;
        	System.out.print(i+" ");
        }
	}

}
