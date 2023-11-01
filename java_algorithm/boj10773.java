package java_algorithm;
import java.util.*;
import java.io.*;
public class boj10773 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i< n ; i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0){
                stack.push(num);
            } else{
                stack.pop();
            }
        }
        int size = stack.size();
        if(size != 0){
            for(int i = 0; i < size; i++){
                answer += stack.pop();
            }
        }

        System.out.println(answer);
    }
}
