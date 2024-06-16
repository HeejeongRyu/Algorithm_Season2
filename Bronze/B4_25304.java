/*
문제
준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.

영수증에 적힌,

구매한 각 물건의 가격과 개수
구매한 물건들의 총 금액
을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
*/


package stap_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4_25304 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int sum = Integer.parseInt(br.readLine());
		int chk_sum = 0;
		String result = "Yes";
		
		int cnt = Integer.parseInt(br.readLine());
		int [][] arr = new int [cnt][2];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			arr [i][0] = Integer.parseInt(st.nextToken());
			arr [i][1] = Integer.parseInt(st.nextToken());
			
			chk_sum += arr [i][0] * arr [i][1];
			
		}
		
		if(sum != chk_sum) result = "No";
		
		System.out.println(result);
		

	}

}
