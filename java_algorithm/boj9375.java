package java_algorithm;

import java.io.*;
import java.util.*;

public class boj9375 {

    public static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i<t; i++){
            int n = Integer.parseInt(br.readLine());

            Map<String,Integer> map = new HashMap<>();

            for(int j = 0; j < n ; j++){
                st = new StringTokenizer(br.readLine());
                String clothe = st.nextToken();
                String type = st.nextToken();
                map.put(type,map.getOrDefault(type,0) + 1);
            }
            int tmp = 1;
            for(String key : map.keySet()){
                tmp *= (map.get(key)+1);
            }

            System.out.println(tmp-1);
        }
    }
}
