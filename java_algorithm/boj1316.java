package java_algorithm;

import java.io.*;
import java.util.*;

public class boj1316 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = n;
        for(int i = 0; i<n; i++){
            boolean[] appear = new boolean[26]; //알파벳
            String s = br.readLine();
            appear[(int) s.charAt(0) - 97] = true;

            for(int j = 1; j < s.length(); j++){
                char c = s.charAt(j);
                if(c == s.charAt(j-1))
                    continue;

                if(appear[(int) c - 97]){
                    cnt--;
                    break;
                }
                appear[(int) c - 97] = true;
            }
        }
    System.out.println(cnt);
    }
}
