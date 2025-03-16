import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int mid = n / 2;

            for (int i = 0; i < n; i++) {
            if (i < mid) {
                System.out.print((mid - i) + " ");
            } else {
                System.out.print((n - i + mid) + " ");
            }
        }
    }
}
