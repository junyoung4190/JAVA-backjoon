import java.util.Scanner;

public class Operation_10869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int P = A + B;
        int M = A - B;
        int Mul = A * B;
        int D = A / B;
        int R = A % B;

        System.out.println(P);
        System.out.println(M);
        System.out.println(Mul);
        System.out.println(D);
        System.out.println(R);
    }
}
