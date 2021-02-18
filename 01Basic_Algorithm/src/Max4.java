import java.util.Scanner;

public class Max4 {

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        if (max < d) max = d;
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: "); int a = stdIn.nextInt();
        System.out.print("숫자를 입력하세요: "); int b = stdIn.nextInt();
        System.out.print("숫자를 입력하세요: "); int c = stdIn.nextInt();
        System.out.print("숫자를 입력하세요: "); int d = stdIn.nextInt();

        System.out.println("최대값: " + max4(a, b, c, d));

        stdIn.close();
    }
}
