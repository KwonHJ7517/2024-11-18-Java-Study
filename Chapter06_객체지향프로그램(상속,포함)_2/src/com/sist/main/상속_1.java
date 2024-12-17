package com.sist.main;
/*
 *   변경(수정)
 *   ---------- 오버라이딩
 *   => 변수 오버라이딩
 *   => 메소드 오버라이딩
 *   
 */
class Super
{
	String name;
	int age;
	
	// 초기화
	public Super()
	{
		name="권혁준";
		age=27;
	}
}
class Sub extends Super
{
	String name;
	int age;
	public Sub()
	{
		name="심청이";
		age=26;
	}
	public void display()
	{
		System.out.println("Super:name="+super.name);
		// super => 상속 내린 클래스의 변수,메소드
		System.out.println("Super:age="+super.age);
		
		System.out.println("Sub:name="+this.name);
		// this => 상속 받은 클래스의 변수,메소드
		System.out.println("Sub:age="+this.age);
	}
}
public class 상속_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub=new Sub();
		sub.display();
	}

}
