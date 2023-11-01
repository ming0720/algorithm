package java_algorithm;
import java.util.*;
import java.io.*;
public class boj1969 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] dna = new String[n];

        for(int i = 0; i < n; i++){
            dna[i] = br.readLine();
        }

        for(int i = 0; i < m; i++){
            int[] cnt = new int[4];
            for(int j = 0; j < n; j++) {
                char c = dna[j].charAt(i);
                switch (c) {
                    case 'A':
                        cnt[0]++;
                        break;
                    case 'C':
                        cnt[1]++;
                        break;
                    case 'G':
                        cnt[2]++;
                        break;
                    case 'T':
                        cnt[3]++;
                        break;
                }
            }

                int index = 0;
                int max = 0;
                for(int k =0; k<4; k++){
                    if(cnt[k] > max){
                        max = cnt[k];
                        index = k;
                    }
                }

                switch (index){
                    case 0:
                        sb.append('A');
                        break;
                    case 1 :
                        sb.append('C');
                        break;
                    case 2 :
                        sb.append('G');
                        break;
                    case 3 :
                        sb.append('T');
                        break;
                }
                sum += n - max;

        }

        bw.write(sb.toString());
        bw.write("\n");
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
