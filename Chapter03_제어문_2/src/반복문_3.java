/* 
 *    ABCD(계속 증가한다면 for 밖에)
 *    EFGH
 *    IJKL
 *    MNOP
 *    
 *    ABCD(반복 증가한다면 for 안에)
 *    ABCD
 *    ABCD
 *    ABCD
 *    
 *    AAAA(계속 증가시켜야 하고 print(c);넣어라) ({}밑에 c++; 넣어 다음에 증가시켜라)
 *    BBBB
 *    CCCC
 *    DDDD
 *    
 *    #123(if else 대입하여 i와j가 같을때 "#" 넣고 그렇지 않으면 j를 넣어라
 *    1#23
 *    12#3
 *    123#
 *    
 *    ★
 *    ★★
 *    ★★★
 *    ★★★★
 *     i      j
 *    줄수    별표 => i=j 
 *    1      1
 *    2      2
 *    3      3
 *    4      4
 *    
 *    ★★★★
 *    ★★★
 *    ★★
 *    ★
 *    i      j
 *    줄수    별표 => 5-i=j 
 *    1      4
 *    2      3
 *    3      2
 *    4      1
 *    
 *    => 주사위 2개를 던져서 6이 나올 경우의 수를 출력
 *    i와j의 합이 6이 나오면 된다 if 문 사용 if(i+j==6) sysout 하여 ("["+i+","+j+"]");대입
 *    
 *      *
 *     **
 *    ***
 *   ****
 *   i      j     k
 *   줄수   공백   별표
 *   1      3     1
 *   2      2     2
 *   3      1     3
 *   4      0     4
 *   
 *   ****
 *    ***
 *     **
 *      *
 *   i      j     k   i+k=5 ==> k=5-i
 *   줄수   공백   별표
 *   1      0     4
 *   2      1     3
 *   3      2     2
 *   4      3     1
 */
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    for(int i=1;i<=4;i++)
	    {
	    	for(int j=1;j<=4-i;j++)
	    	{
	    		System.out.print(" ");
	    	}
	    
	    for(int k=1;k<=i;k++)
	      {
	    	System.out.print("*");
	      }
	    System.out.println();
	    }
	    
	    for(int i=1;i<=4;i++)
	    {
	    	for(int j=1;j<=1-i;j++)
	    	{
	    		System.out.print(" ");
	    	}
	    
	    for(int k=1;k<=5-i;k++)
	      {
	    	System.out.print("*");
	      }
	    System.out.println();
	    }
	}
}