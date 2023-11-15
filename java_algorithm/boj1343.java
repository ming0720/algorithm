package java_algorithm;
import java.util.*;
import java.io.*;
public class boj1343 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        s = s.replace("XXXX","AAAA");
        s = s.replace("XX", "BB");

        if(s.contains("X")){
            System.out.println("-1");
        } else{
            System.out.println(s);
        }

    }
}
