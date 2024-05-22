/*문제
두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. */

package stap_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B5_10869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String [] inputString = br.readLine().split(" ");
			
			int [] inputInt = Arrays.stream(inputString).mapToInt(Integer::parseInt).toArray();
			
			System.out.println(inputInt[0] + inputInt[1]);
			System.out.println(inputInt[0] - inputInt[1]);
			System.out.println(inputInt[0] * inputInt[1]);
			System.out.println(inputInt[0] / inputInt[1]);
			System.out.println(inputInt[0] % inputInt[1]);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
