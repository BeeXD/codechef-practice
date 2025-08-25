package codechef.java1;
import java.util.Scanner;

public class codecheftakediscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            int n = scanner.nextInt();
            long x = scanner.nextInt();
            long y = scanner.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            long newsum = 0;
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[j];
            }
            for (int j = 0; j < n; j++) {
                newsum += Math.max(0, a[j] - y);
            }
            if (newsum + x < sum) {
                System.out.println("COUPON");
            } else {
                System.out.println("NO COUPON");
            }
        }
        scanner.close();
    }
}