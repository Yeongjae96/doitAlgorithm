import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        while(i <= n) {
            sum += i;
            if (i != n) System.out.print(i + " + ");
            else System.out.print(i);
            i++;
        }

        System.out.println(" = " + sum);

        stdIn.close();
    }
}
