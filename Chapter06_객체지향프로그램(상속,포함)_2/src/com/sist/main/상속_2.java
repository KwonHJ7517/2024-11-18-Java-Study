package com.sist.main;
/*
 *      메소드 오버라이딩 => 메소드의 기능 변경 => 유지보수
 *      --------------------------------------
 * *****오버라이딩의 조건  (인터페이스)
 *      1. 상속 => 상속받은 메소드를 변경해서 사용
 *      2. 메소드명이 동일
 *      3. 매개변수가 동일
 *      4. 리턴형이 동일
 *      5. 접근지정어가 확대 가능 , 축소는 불가
 *      
 *      => 실무
 *         ---------
 *         1) 변수
 *         2) 연산자
 *         3) 제어문
 *         4) 메소드
 *         5) 멤버변수
 *         6) 생성자
 *         7) 오버라이딩***
 *         8) 인터페이스***
 *         9) 예외처리***
 *         
 *    class A
 *    {
 *      void display(){}
 *    }
 *    class B extends A
 *    {
 *      1.void display(){}
 *      2.public void display(){}
 *      3.protected void display(){}
 *      4.private void display(){} **** 오류
 *    }
 *    
 *    interface A
 *    {
 *      void display();
 *      int a; ==> 오류 => 상수형 (int a=10;으로 설정)
 *    }
 *    class B implements A
 *    {
 *      void display(){} ==> 오류 (public 대입)
 *    }
 *    
 *    ==> 정적 바인딩 => 한개의 주소를 유지
 *    ==> 동적 바인딩 => new 주소변경
 *    ==> 가상함수
 */
class Animal
{
	int a=10;
	public void run()
	{
		System.out.println("걷는다");
	}
}
class Dog extends Animal
{
	int a=20;
	public void run()
	{
		System.out.println("네발로 걷는다");
	}
}
class Human extends Animal
{
	int a=30;
	public void run()
	{
		System.out.println("두발로 걷는다");
	}
}
public class 상속_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 관련 클래스가 여러개 있는 경우 => 상위 클래스로 이용
		// 객체를 한개만 생성해서 사용
		Animal ani=new Dog();
		System.out.println(ani.a);
		ani.run();
		ani=new Human();
		System.out.println(ani.a);
		ani.run();
		
	}

}
