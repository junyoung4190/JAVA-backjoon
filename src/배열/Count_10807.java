package 배열;

import java.util.Scanner;

public class Count_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];
        int cnt = 0;

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        for(int i = 0; i < N; i++){
            if(arr[i] == v)
                cnt++;
        }

        System.out.println(cnt);
    }
}
