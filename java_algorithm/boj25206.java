package java_algorithm;
import java.util.*;
import java.io.*;
public class boj25206 {
    public static void main(String[] args) throws IOException{
        double totalSum = 0;
        double ScoreSum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] gradeList = {"A+","A0","B+","B0","C+","C0","D+","D0","F","P"};
        double[] gradeNum = {4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0.0,0.0};
        String[] str = new String[20];
        for(int i = 0; i<20; i++){
            str[i] = br.readLine();
            StringTokenizer st = new StringTokenizer(str[i]," ");
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            for(int j = 0; j < 10; j++){
                if(grade.equals(gradeList[j])){
                    totalSum += score * gradeNum[j];
                    if(j != 9){
                        ScoreSum += score;
                    }

                }
            }
        }
        double avg = totalSum/ScoreSum;
        System.out.println(String.format("%.6f",avg));
    }
}
