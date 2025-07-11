package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class Sum_CaseII_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int a;
        int b;

        for(int i = 1; i <= t; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": "+ a + " + " + b + " = " + (a + b) + "\n");
        }

        bw.close();
    }
}
