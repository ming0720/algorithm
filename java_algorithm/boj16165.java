package java_algorithm;
import java.util.*;
import java.io.*;

public class boj16165 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, String> map = new HashMap<>();
        Map<String, String[]> groupMap = new HashMap<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            String group = new String(br.readLine());
            int num = Integer.parseInt(br.readLine());
            String[] tmp = new String[num];
            for(int j = 0; j < num; j++){
                String member = new String(br.readLine());
                map.put(member,group);
                tmp[j] = member;
            }
            Arrays.sort(tmp);
            groupMap.put(group,tmp);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i<m; i++){
            String quiz = br.readLine();
            int type = Integer.parseInt(br.readLine());
            if(type == 1){
                bw.write(map.get(quiz)+"\n");
            } else{
                int num = groupMap.get(quiz).length;
                for(int j = 0; j<num; j++){
                    bw.write(groupMap.get(quiz)[j] + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
