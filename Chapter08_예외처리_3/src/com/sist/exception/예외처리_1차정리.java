package com.sist.exception;
/*
 *     예외처리가 필요한 클래스
 *     -----------------
 *     => 라이브러리에서 제공
 *        ------ 입출력 / 네트워크 / 오라클 / URL / 쓰레드
 *               ---------------------------------
 *               | CheckException
 *                 => 컴파일시에 확인 (예외처리 설정)
 *     => 예외처리 방법
 *        1. 직접처리 (예외복구)
 *           try~catch~finally
 *           
 *           try
 *           {
 *              정상 수행문장 => 일부러 에러가 있는 문장을 사용하는 것이 아니다
 *                => 에러발생 (개발자 실수,사용자 입력문제)
 *                                   ----------- 보통 이게 문제
 *                                   (개발자 실수가 없는 것은 자동 완성기)
 *           }catch(예외클래스)
 *           {
 *              1. 에러내용 출력 (어디서 에러 발생된건지 확인)
 *                 getMessage() : 에러 내용만 출력
 *                 printStackTrace() : 실행과정 => 에러의 위치 확인
 *              2. 예외 복구 => 다시 입력을 유도하는 경우
 *              		  => 웹/윈도우에서만 가능
 *              		  => 데이터 수집 (Jsoup(정적),셀레니음(동적))
 *              3. 에러 확인 => 소스코딩 수정(********)
 *           }
 *           finally
 *           {
 *              생략이 가능
 *              => 닫기 (파일서버,오라클)
 *              => try / catch 상관없이 무조건 수행
 *           }
 *           *** catch => 통합해서 한번에 처리
 *               Exception / Throwable
 *               
 *           => try => finally 수행
 *              : 에러가 없는 경우
 *           => try => catch => finally 수행
 *              : try 수행 과정에서 에러가 발생 => catch 수행
 *                => finally 수행
 *           => 사전에 에러 처리
 *           => 에러시에 문제점
 *              ----------
 *              | 에러 위치부터 try 종료까지 스킵
 *        2. 간접처리 (예외회피) => 선언만 한다
 *           메소드뒤에 throws
 *           => 직접처리하는 부분이 아니고 이런 에러가 발생할 것 같다 예상
 *              (컴파일러에게 알려준다)
 *              => 컴파일러가 예외처리 가부를 확인하지 않는다
 *           => 복구할 수 없다 / 정상 수행 / 시스템 자체 처리
 *           => 라이브러 메소드 => 반드시 예외처리 후 사용해야 된다
 *              ------------------------- try~catch
 *           => 선언방식
 *              method() throws 예외클래스,예외클래스....
 *                              ------------------
 *                              구분은 (,) 클래스 순서는 상관없다
 *              => 처리시에는 통합
 *                        ---- Exception / Throwable
 *                        ---- catch , throws => 통합
 *           => 임의로 발생 : throw => 사용자 정의 예외처리
 *           => 모든 class , method , 예외처리 , 데이터형
 *              ----------------------------------
 *              
 */
public class 예외처리_1차정리 {
	public void display() throws Exception
	{
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		예외처리_1차정리 a=new 예외처리_1차정리();
		try
		{
			a.display();
		}catch(Exception e){}
		System.out.println("종료");
	}

}
