package java_algorithm;
import java.util.*;
public class boj11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for(int i : cNum){
            sum += i - '0';
        }
        System.out.println(sum);


    }
}
