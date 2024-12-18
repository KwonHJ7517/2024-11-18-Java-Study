package com.sist.excption;
// try ~ catch ~ finally
// finally 생략이 가능
// 사용처 => 파일 닫기 / 오라클 연결 해제 / 서버 연결 해제
// try (정상수행) catch(오류발생) 상관없이 무조건 수행
import java.io.*;
/*    
 *    try
 *    {
 *      FileReader fr=new FileReader()
 *    }catch(IOException e)
 *    {
 *    }
 *    finally
 *    {
 *       fr(x) => 사용하려면 try 위에 FileReader fr; 선언 후 fr=new FileReader()로 가야함
 *    }
 */
public class 예외처리_finally사용법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*FileReader fr=null;
		//모든 클래스의 초기값은 null// 메모리주소를 가지고 있지 않은 상태
		try
		{
			fr=new FileReader("c:\\javaDev\\seoul_nature.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				// -1 => EOF (파일이 끝날때까지 읽는다)
				System.out.print((char)i);
			}
			
		}catch(IOException ex) // 더 큰 수 Exception , Throwable
		{
			ex.printStackTrace(); // 에러 확인
		}
		finally
		{
			try
			{
				fr.close();
			}catch(IOException e) {}
		}*/
		// 자동 resource
		try(FileReader fr=new FileReader("c:\\javaDev\\seoul_nature.txt"))
				{
					int i=0;
					while((i=fr.read())!=-1)
					{
						System.out.print((char)i);
					}
				}catch(IOException e)
				{
					System.out.println(e.getMessage());
				}
	}

}
