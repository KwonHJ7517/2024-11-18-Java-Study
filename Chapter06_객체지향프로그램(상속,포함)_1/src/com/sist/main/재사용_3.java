package com.sist.main;
/*
 *   상속 : 이미 만들어진 클래스를 재사용
 *        --------------- 기존의 클래스 (사용자 정의,라이브러리)
 *   포함 : 재사용
 *         상속 / 포함
 *         ---   ---
 *               | 있는 그대로 사용
 *         | 변경해서 사용
 *         | 상속이 안되는 클래스 : final class
 *                            -----------
 *                            String , System , Scanner....
 *   상속의 두가지 : 상속을 내리는 클래스 : 공통적으로 적용되는 내용
 *               상속을 받는 클래스
 *                  => 유지보수가 편하다
 *                  => 반복 제거
 *                  => 관리 용이
 *                  => 속도가 느리다
 *                  => 변경이 어렵다
 *                  => 소스를 볼 수 없기 때문에 가독성이 떨어짐
 *   => 클래스를 상속 받아서 => 새로운 클래스 (기존의 클래스+새로운 클래스)
 *   예)
 *      공통 기능
 *      --------게시판
 *        글쓰기
 *        상세보기
 *        목록
 *        수정
 *        삭제
 *        검색
 *     ----------   
 *      묻고 답하기 extends 게시판
 *        답하기
 *      답변 게시판 extends 게시판
 *        답변하기
 *      자유 게시판 extends 게시판
 *      
 *      자료실 extends 게시판
 *      
 *        다운로드/업로드
 *    *** 자바에서 가장 큰 클래스
 *        Object => 최상위 클래스
 *        => 리턴형 Object
 *           ----------- 클래스 리턴형 => Object
 */
import java.util.*;
public class 재사용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("홍길동");
		
		String name=(String)list.get(0);
		
	}

}
