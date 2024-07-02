/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
*/

package temp1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B5_11022 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int a = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= a; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int aa = Integer.parseInt(st.nextToken());
			int bb = Integer.parseInt(st.nextToken());
			bw.write("Case #" + i + ": " + aa +" + " + bb + " = " + (aa + bb) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
		
		

	}

}
