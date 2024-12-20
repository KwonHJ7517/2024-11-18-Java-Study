package com.sist.util;
import java.util.*;
public class 라이브러리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color="red|yellow|green|pink|magenta|blue|black|cyan";
		StringTokenizer st=new StringTokenizer(color, "|");
		System.out.println("컬러의 갯수:"+st.countTokens());
		// 초과되면 오류 발생함
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}
		/*
		 *    hasMoreTokens
		 *    
		 *    ---------------
		 *    => before First
		 *    ---------------
		 *    red => st.nextToken() => true
		 *    ---------------
		 *    yellow => st.nextToken() => true
		 *    ---------------
		 *    green => st.nextToken() => true
		 *    ---------------
		 *    ....... => st.nextToken() => false
		 *    ---------------
		 *    => after last
		 *    ---------------
		 *    
		 */
		
	}

}
