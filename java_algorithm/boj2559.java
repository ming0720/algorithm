package java_algorithm;
import java.io.*;
import java.util.*;
public class boj2559 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] temp = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            temp[i] = Integer.parseInt(st.nextToken());
        }

        // s[4] / s[5]-s[0]
        // s[k-1] = 초기값
        int[] sum = new int[n+1];
        sum[0] = temp[0];
        for(int i = 1; i < n; i++){
            sum[i] += sum[i-1] + temp[i];
        }
        int[] answer = new int[n - k + 1];
        answer[0] = sum[k-1];
        for(int i = 1; i < n-k+1; i++){
            // 0 ~ 4까지의 누적합 = answer[0]
            // 1 ~ 5까지의 누적합 = answer[1] = 0~5까지의 누적합 - 0~0까지의 누적합
            // 2 ~ 6까지의 누적합 = answer[2] = 0~6까지의 누적합 - 0~1까지의 누적합
            answer[i] = sum[i+k-1] - sum[i-1];

        }
        Arrays.sort(answer);
        System.out.println(answer[answer.length-1]);

    }
}
