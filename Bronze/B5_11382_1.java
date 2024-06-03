/*문제
꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!*/

package temp1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; // IOException을 추가해야 합니다.
import java.util.Arrays;

public class B5_11382 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inputString = br.readLine().split(" ");
        
        long[] inputLong = Arrays.stream(inputString).mapToLong(Long::parseLong).toArray();
        
        long sum = 0;
        
        for(long num : inputLong) {
            sum += num;
        }
        
        System.out.println(sum);
    }
}

