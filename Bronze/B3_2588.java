/*(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
472
*385
-----------------
     2360	1
   3776	2
 1416	3
 181820	4
(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
*/
package stap_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class B3_2588 {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();
 		
		char[] b = B.toCharArray();
				
		System.out.println(A * (b[2]-'0'));
		System.out.println(A * (b[1]-'0'));
		System.out.println(A * (b[0]-'0'));
		System.out.println(A * Integer.parseInt(B));
 
	}
}
