/*문제
두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.*/

package stap_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B5_1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String [] inputString = br.readLine().split(" ");
			
			double [] inputDouble = Arrays.stream(inputString).mapToDouble(Double::parseDouble).toArray();
			
			double sum = inputDouble[0] / inputDouble[1];
			
			System.out.println(sum);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
