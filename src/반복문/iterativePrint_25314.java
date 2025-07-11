package 반복문;

import java.util.Scanner;

public class iterativePrint_25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 1; i <= (N / 4); i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
