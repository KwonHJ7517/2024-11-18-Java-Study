/*
 *  문자 자르기
 *  ********* 필수!!
 *  
 *  substring : 문자열 자르기
 *  ㅣ 지정된 위치부터 마지막까지 자르기
 *    Hello Java
 *    0123456789
 *    substring(6) J부터 잘라라 명령(Java)
 *  ㅣ 중간에서 자르기
 *    substring(1,4) e 부터 o 까지 잘라라 (ell)
 *                -- endIndex-1
 *    공백 부분을 날리는 함수는 .trim()
 */
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String data="Hello.Hello.java";
		//             0123456789101112131415
		//System.out.println(data.substring(data.lastIndexOf(".")+1));
		String data="ID:admin,PWD:1234";
		String id=data.substring(data.indexOf("a"),data.indexOf(","));
		System.out.println(id);
		String pwd=data.substring(data.lastIndexOf(":")+1);
		System.out.println(pwd);
		System.out.println("data="+data);
		
		
		String adress="서울 동대문구 회기동 346-14[새주소] 서울 동대문구 경희대로4길 76";
		String adr1=adress.substring(0,adress.indexOf("["));
		System.out.println(adr1);
		String adr2=adress.substring(adress.indexOf("]")+1);
		System.out.println(adr2.trim());
		// trim() => 좌우의 공백을 제거
		System.out.println(adress);
		
		String s="Hello Java";
		String ss=s.substring(s.indexOf(" ")+1);
		System.out.println(ss);
	}

}
