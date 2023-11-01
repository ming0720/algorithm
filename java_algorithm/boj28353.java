package java_algorithm;
import java.util.*;
import java.io.*;
public class boj28353 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] weight = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            weight[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(weight);

        int start = 0;
        int end = weight.length-1;
        int answer = 0;
        while(start < end){
            if(weight[start] + weight[end] <= k){
                start++;
                end--;
                answer++;
            } else{
                end--;
            }
        }
        System.out.println(answer);
    }
}
