package 반복문;

import java.util.Scanner;

public class Receipt_25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int total = 0;

        for(int i = 0; i < N; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            total += a * b;
        }

        if(X == total){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
