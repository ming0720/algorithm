package java_algorithm;
import java.util.*;
import java.io.*;

public class boj10799 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");
        Stack<String> stack = new Stack<>();
        int result = 0;
        for(int i = 0; i < s.length; i++){
            if(s[i].equals("(")){
                stack.push("(");
                continue;
            }
            if(s[i].equals(")")){
                stack.pop();
                if(s[i-1].equals("(")){
                    result += stack.size();
                } else{
                    result++;
                }
            }

        }
        System.out.println(result);
    }
}
