package com.sist.win;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*; // 윈도우 관련 패키지
/*
 *   상속 => 기존의 클래스를 재사용 => 추가 , 변경해서 사용
 *          ---------
 *          사용자 정의
 *          라이브러리 => 변경해서 사용하는 상속이 많다
 *          => 코드의 재사용이 높다 => 최적화에 문제가 생길 수 있다
 *             --------- 개발 속도가 빠르다
 *          => 코드 관리가 용이하다
 *          => 소스가 간결해진다 => 코드를 볼 수 없다
 *          => 기존의 클래스는 이미 검증된 상태로 신뢰성이 높다
 *      상속 : is-a => 변경 후 사용
 *      포함 : has-a => 있는 그대로 사용***
 *      
 *      객체지향 => 권장(캡슐화 , 재사용(상속) , 변경,추가가 쉽게)
 *                                      ------------
 *                                      오버로딩,오버라이딩
 *      *** 상속의 문제점
 *          = 결합성이 높다 (다른 클래스에 영향이 크다)
 *          ex) 상속받는 클래스 => 상속을 내리는 클래스를 변경하면 에러
 *          = 제약조건이 많다
 *          = 메모리가 커진다 => 속도가 느리다
 *          = 윈도우를 사용하지 않는 이유 => 속도가 느리다
 *      특징)
 *       1. 단일 상속만 가능
 *       2. 상속 기호 : extends(클래스를 확장해서 사용한다는 기호)
 *          ex) class A extends B
 *              A클래스는 B클래스를 확장해서 새로운 클래스 구축
 *              => A클래스는 B클래스로부터 상속을 받는다
 *       3. 상속 => 특별한 경우가 아니면 모든 변수,메소드를 상속
 *          
 *          => 특별한 경우(예외)
 *             static : 공유(여러개의 객차가 공동으로 사용)
 *                      사용이 가능하게 만든다
 *             생성자
 *             초기화 블록
 *             private : 상속은 되지만 접근이 불가능
 *             ------- 사용을 위해선 setter/getter 대입
 *             
 *         상속 내리는 클래스(super,상위클래스,부모클래스)
 *         상속 받는 클래스의 변수,메소드에 접근 불가
 *         -----------
 *         자신의 객체 ====> this
 *         상위 클래스의 객체 =====> super
 *         
 *         메모리 할당
 *         A a=new A()
 *          => A클래스가 가지고 있는 변수,메소드 사용
 *         B b=new B()
 *          => B클래스가 가지고 있는 변수,메소드 사용
 *         A c=new B()
 *          => 변수 => A클래스 , 메소드는 B클래스가 가지고 있
 */
/*class A
{
	int a=10;
	void display()
	{
		System.out.println("A클래스가 가지고 있는 display()");
	}
}
class B extends A
{
	int a=100;
	void display()
	{
		System.out.println("B클래스가 가지고 있는 display()");
	}
}*/
public class 윈도우상속 extends JFrame {
	//윈도우 설정
	JButton b1=new JButton("North");
	JButton b2=new JButton("East");
	JButton b3=new JButton("West");
	JButton b4=new JButton("Center");
	JButton b5=new JButton("South");// 포함 클래스
	public 윈도우상속()
	{ 
		//setLayout(new FlowLayout());
		setLayout(new GridLayout(5,1));
		// BorderLayout => default
		add(b1);add(b2);add(b3);add(b4);add(b5);
		// 레이아웃
		/*add("North",b1);
		add("South",b5);
		add("Center",b4);
		add("East",b2);
		add("West",b3);*/
		// 크기 결정
		setSize(640, 400);
		// 윈도우 보여달라
		setVisible(true);
	}
	public static void main(String[] args) {
		new 윈도우상속();
		// TODO Auto-generated method stub
		/*A aa=new A();
		System.out.println(aa.a);
		aa.display();
		
		B bb=new B();
		System.out.println(bb.a);
		bb.display();
		
		A cc=new B();
		System.out.println(cc.a);
		cc.display();*/
	}

}
