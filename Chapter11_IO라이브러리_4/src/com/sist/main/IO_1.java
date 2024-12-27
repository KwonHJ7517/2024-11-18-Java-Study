package com.sist.main;
import java.util.*;
import java.io.*;
class Sawon implements Serializable
{
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public Sawon(int sabun, String name, String dept, String job, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.pay = pay;
	}
	// 디폴트 생성자 => 생성자가 이미 존재 => 자동생성이 안된다
	public Sawon()
	{
		
	}
	// 값을 저장
	
}
public class IO_1 {
	public static void main(String[] args) {
		List<Sawon> list=new ArrayList<Sawon>();
		// Object => 데이터를 모아서 저장이 가능
		list.add(new Sawon(1,"홍길동","개발부","사원",3200));
		list.add(new Sawon(2,"심청이","총무부","팀장",4200));
		list.add(new Sawon(3,"이순신","영업부","대리",3500));
		list.add(new Sawon(4,"강감찬","인사부","과장",4000));
		list.add(new Sawon(5,"춘향이","재경부","부장",4500));
		ObjectOutputStream oos=null;
		try
		{
			File file=new File("c:java_data\\sawon_info.txt");
			if(!file.exists())//파일이 없다면
			{
				file.createNewFile(); //파일을 만든다
			}
			FileOutputStream fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			
			// 저장
			oos.writeObject(list);
			System.out.println("객체 단위 저장완료");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				oos.close();
			}catch(Exception ex) {}
		}
	}

}
