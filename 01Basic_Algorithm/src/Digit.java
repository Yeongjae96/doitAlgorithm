import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("양의 자리수를 구합니다.");

        int n = 0;

        while(true) {
            System.out.print("n의 값: ");
            n = stdIn.nextInt();
            if (n > 0) break;
        }

        int i = 0;

        while (n > 0) {
            n /= 10;
            i++;
        }

        System.out.println("n의 자리수는 " + i + " 입니다.");
        stdIn.close();

    }
}
