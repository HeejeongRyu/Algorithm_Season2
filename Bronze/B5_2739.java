/*문제
N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
*/

package step_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class B5_2739 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());	
		

		br.close();
        
		for(int i = 1; i<10;i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
}
