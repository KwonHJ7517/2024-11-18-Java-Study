	
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String movie="";
		String[] data=movie.split("\\");
		// 정규식 => * , + , . , | , ?
		for(String m:data) // for-each : 향상된 for문
		{
			System.out.println(m);
		}
	}

}
