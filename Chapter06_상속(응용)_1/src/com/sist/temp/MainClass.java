package com.sist.temp;
class Super
{
	int a=10;
	int b=20;
	public Super()
	{
		System.out.println("Super() Call...");
	}
}
class Sub extends Super
{
	int a,b; // this가 super값을 바꾸지 않게 변수를 부여함 / 없으면 this가 super값을 자신과 같게 바꿈
	public Sub()
	{
		System.out.println("Sub() Call...");
	}
	public void display()
	{
		super.a=100;
		super.b=200;
		this.a=1000;
		this.b=2000;
		System.out.println("Super:a="+super.a);
		System.out.println("Super:b="+super.b);
		System.out.println("Sub:a="+this.a);
		System.out.println("Sub:b="+this.b);
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s=new Sub();
		s.display();
	}

}
