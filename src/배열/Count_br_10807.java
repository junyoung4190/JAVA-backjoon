package 배열;

import java.io.*;
import java.util.StringTokenizer;

public class Count_br_10807 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int arr[] = new int[N];

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int v = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            if(arr[i] == v)
                cnt++;
        }
        System.out.println(cnt);

        br.close();
        bw.flush();
        bw.close();
    }
}
