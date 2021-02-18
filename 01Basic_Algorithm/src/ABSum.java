import java.util.Scanner;

public class ABSum {
    static int sumof(int a, int b) {
        int result = 0;
        int max = 0;
        int min = 0;

        if (a >= b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        while(min <= max) {
            result += min;
            min++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a부터 b까지의 합을 구합니다.");
        System.out.print("a의 값 : "); int a = stdIn.nextInt();
        System.out.print("b의 값 : "); int b = stdIn.nextInt();

        int sum = sumof(a, b);

        System.out.println("a부터 b까지의 값: " + sum);

        stdIn.close();
    }
}
