import java.lang.reflect.Array;
import java.util.Arrays;

public class 배열_생성_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha={'A','B','C','D','E'};
		/*
		 *    alpha
		 *    -----   heap실제 저장값 [0] [1] [2] [3] [4]
		 *    0x100   ===========> ------------------
		 *    -----                 A   B   C   D   E
		 *                         ------------------
		 */
		// 저장된 데이터 출력
		for(char c:alpha)
		alpha[1]='K';
		alpha[4]='M';
		System.out.println(Arrays.toString(alpha));
		// 배열안에 있는 모든 데이터를 한번에 읽어서 출력
	}

}
