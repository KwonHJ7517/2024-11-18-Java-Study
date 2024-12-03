// 6개의 난수 발생 => 중복이 없는 데이터 출력 (1~45사이의 난수)
// => 피망 => 로직
import java.util.Arrays;
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto=new int[6];
		int su=0;//난수 발생시 저장하는 변수
		boolean bCheck=false; //중복 여부 확인
		
		for(int i=0;i<lotto.length;i++)
		{
			bCheck=true;
			while(bCheck) //중복여부 확인
			{
				// 난수 발생
				su=(int)(Math.random()*45)+1; // 1~45
				bCheck=false;//while 문 종료
				//같은 정수가 있는지 확인
				for(int j=0;j<i;j++)
				{
					if(lotto[j]==su)// 저장된 데이터중에 난수와 같은 값이 있는지 확인

					{
						bCheck=true;
						break;
					}
				}
			}
			lotto[i]=su;
		}
		Arrays.sort(lotto); // 낮은 숫자부터 정렬
		System.out.println(Arrays.toString(lotto));
	}

}
