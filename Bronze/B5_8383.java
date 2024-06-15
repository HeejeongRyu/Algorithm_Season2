/*
문제
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class B5_8383 {
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
		int a = Integer.parseInt(br.readLine());
		br.close();
		int s = 0;
 
		for( int i = 1 ; i <= a ; i++ ) s+=i;
 
		System.out.println(s);
	}
}
