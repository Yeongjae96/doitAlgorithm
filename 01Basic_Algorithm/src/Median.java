import java.util.Scanner;

public class Median {
    static int median(int a, int b, int c) {
        if (a > b) {
            if (b > c) {
                return b;
            } else if(a > c) {
                return c;
            } else {
                return a;
            }
        } else {
            if (a > c) {
                return a;
            } else if (b < c) {
                return b;
            } else {
                return c;
            }
        }

    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: "); int a = stdIn.nextInt();
        System.out.print("숫자를 입력하세요: "); int b = stdIn.nextInt();
        System.out.print("숫자를 입력하세요: "); int c = stdIn.nextInt();

        System.out.println("중간값: " + median(a, b, c));
        stdIn.close();
    }
}
