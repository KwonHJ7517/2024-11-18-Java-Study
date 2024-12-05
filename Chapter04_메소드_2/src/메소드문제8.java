public class 메소드문제8 {
	static char munje_8(int score)
	{
		char c=' ';
		switch(score/10)
		{
		case 10: case 9:
			c='A';
			break;
		case 8:
			c='B';
			break;
		case 7:
			c='C';
			break;
		case 6:
			c='D';
			break;
		default:
			c='F';
			break;
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=munje_8(10);
		System.out.println("해당 점수의 학점은 "+c+" 입니다");
	}

}
