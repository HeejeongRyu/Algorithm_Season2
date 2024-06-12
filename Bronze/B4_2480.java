import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class B4_2480 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int aa, bb, cc;
		aa = Integer.parseInt(st.nextToken());
		bb = Integer.parseInt(st.nextToken());
		cc = Integer.parseInt(st.nextToken());
 
		if (aa != bb && bb != cc && aa != cc) {
			int max = 0;
			if (aa > bb) {
				if (cc > aa) {
					max = cc;
				} 
				// aa > (bb, cc)
				else {
					max = aa;
				}
			}	
			else {
				if (cc > bb) {
					max = cc;
				}
				else {
					max = bb;
				}
			}
			System.out.println(max * 100);
		}
		else {
			if (aa == bb && aa == cc) {
				System.out.println(10000 + aa * 1000);
			}
			else {
				if(aa == bb || aa == cc) {
					System.out.println(1000 + aa * 100);
				}
				else {
					System.out.println(1000 + bb * 100);
				}
			}
		}
	}
}
