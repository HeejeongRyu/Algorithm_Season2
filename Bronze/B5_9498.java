/*문제
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.*/

package temp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_9498 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputInt = Integer.parseInt(br.readLine());

		System.out.println((inputInt >= 90) ? "A" : (inputInt >= 80 ? "B" : (inputInt >= 70 ? "C" : (inputInt >= 60 ? "D" : "F"))));
	}

}
