import java.util.Scanner;

public class GausSum {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = (int)((1 + n) * n / 2.0);

        System.out.println("총합: " + sum);

        stdIn.close();
    }
}
