package 반복문;

import java.util.Scanner;

public class Sum_CaseIV_10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //EOF (End of File) : 데이터 소스로부터 더이상 읽을 수 있는 데이터가 없음을 나타내는 용어.
        // 알고리즘에서 입력값을 얼마나 받을 수 있는지 명시하지 않았을 경우 EOF를 사용함.
        while(scanner.hasNextInt()){
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println(A + B);
        }
    }
}
