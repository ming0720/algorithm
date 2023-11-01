package java_algorithm;

import java.util.*;
import java.io.*;
public class study0809 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<Character> arr = new ArrayList<>();
        for(int i = 0 ; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                int v = map.get(str.charAt(i));
                map.put(str.charAt(i),v+1);
            } else{
                map.put(str.charAt(i),1);
                arr.add(str.charAt(i));
            }
        }

        for(Character c : arr){
            bw.write(c);
            if(map.get(c) != 1)
                bw.write(map.get(c).toString());
        }
        bw.flush();
        bw.close();

    }
}
