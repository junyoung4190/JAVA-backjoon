package 조건문;

import java.util.Scanner;

public class threeDice_2480 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        if(A == B && B == C){
            System.out.println(10000 + A * 1000);
        } else if(A == B || A == C || B == C){
            if(A == B){
                System.out.println(1000 + A * 100);
            } else if(A == C){
                System.out.println(1000 + A * 100);
            } else {
                System.out.println(1000 + B * 100);
            }
        } else {
            int max = A;
            if(max < B){
                max = B;
                if(max < C){
                    max = C;
                }
            }
            if(max < C){
                max = C;
                if(max < B){
                    max = B;
                }
            }

            System.out.println(max * 100);
        }
    }
}
