package java_algorithm;
import java.util.*;
import java.io.*;
public class boj1431 {
    public static void main(String[] args) throws IOException {
        //A와 B의 길이가 다르면, 짧은 것이 먼저 온다.
        //만약 서로 길이가 같다면, A의 모든 자리수의 합과 B의 모든 자리수의 합을 비교해서 작은 합을 가지는 것이 먼저온다. (숫자인 것만 더한다)
        //만약 1,2번 둘 조건으로도 비교할 수 없으면, 사전순으로 비교한다. 숫자가 알파벳보다 사전순으로 작다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (o1,o2) -> {
           int result = o1.length() - o2.length();
           if(result == 0){
               result = compareNum(o1) - compareNum(o2);
           }
           if(result == 0){
               result = o1.compareTo(o2);
           }
           return result;
        });

        for(String s : arr){
            System.out.println(s);
        }
    }
    public static int compareNum(String s){
        char[] c = s.toCharArray();
        int tmp = 0;
        for(int i = 0; i<c.length; i++){
            if(c[i] - '0' >=0 && c[i] - '0' <=9){
                tmp += c[i] - '0';
            }
        }
        return tmp;
    }
}
