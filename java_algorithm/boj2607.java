package java_algorithm;

import java.io.*;
import java.util.*;

public class boj2607{
    private static HashMap<Character,Integer> origin, other;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()) -1;
        String s = br.readLine();

        int s_len = s.length();
        int ans = 0;

        origin = new HashMap<>();
        other = new HashMap<>();

        init(origin);

        for(int i = 0; i<s_len; i++){
            origin.put(s.charAt(i),origin.get(s.charAt(i))+1);
        }

        for(int i =0; i < n; i++){
            init(other);
            String o = br.readLine();
            int o_len = o.length();

            for(int j = 0; j<o_len; j++){
                other.put(o.charAt(j),other.get(o.charAt(j))+1);
            }
            if (check(other)){
                ans++;
            }
        }
        bw.write(ans+"");
        bw.close();
        br.close();
    }

    private static void init(HashMap<Character,Integer> map){
        for(char c = 'A'; c <= 'Z'; c++){
            map.put(c,0);
        }
    }

    private static boolean check(HashMap<Character, Integer> other){
        int ori = 0;
        int oth = 0;
        int ori_len = 0;
        int oth_len = 0;
        int diff = 0;

        for(char c = 'A'; c <='Z'; c++){
            ori_len += (ori = origin.get(c));
            oth_len += (oth = other.get(c));
            diff += Math.abs(ori-oth);
        }
        return diff<=2 && Math.abs(ori_len - oth_len) <=1;
    }
}