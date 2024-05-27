/*문제
(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?

(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?

세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.*/
package temp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B5_10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String [] inputString  = br.readLine().split(" ");

			int [] inputInt = Arrays.stream(inputString).mapToInt(Integer::parseInt).toArray();

			int A = inputInt[0];
			int B = inputInt[1];
			int C = inputInt[2];

			System.out.println((A+B)%C);
			System.out.println(((A%C) + (B%C))%C);
			System.out.println((A*B)%C);
			System.out.println( ((A%C) * (B%C))%C);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
