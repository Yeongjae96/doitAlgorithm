import java.util.Scanner;

public class Min4 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        if (min > d) min = d;
        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: "); int a = stdIn.nextInt();
        System.out.print("숫자를 입력하세요: "); int b = stdIn.nextInt();
        System.out.print("숫자를 입력하세요: "); int c = stdIn.nextInt();
        System.out.print("숫자를 입력하세요: "); int d = stdIn.nextInt();

        System.out.println("최소값: " + min4(a, b, c, d));
        stdIn.close();
    }
}
