/*문제
두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.*/

package stap_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class B5_1001 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] inputString = br.readLine().split(" ");
		
		int [] inputInt = Arrays.stream(inputString).mapToInt(Integer::parseInt).toArray();
		
		int sum = inputInt[0] - inputInt[1];
		
		System.out.println(sum);

	}

}
