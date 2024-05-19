/*문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.*/

package stap_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B5_1000 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String [] inputStrings = br.readLine().split(" ");
		
		//Arrays.stream(inputStrings): 문자열 배열을 스트림으로 변환.
		//mapToInt(Integer::parseInt): 스트림의 각 문자열 요소를 정수로 변환.
		//toArray(): 정수 스트림을 정수 배열로 변환.
		int [] inputInts = Arrays.stream(inputStrings).mapToInt(Integer::parseInt).toArray();
		
		int sum = 0;
		
		for(int i : inputInts)	{
			sum += i;
		}
		
		System.out.println(sum);
		
	}

}
