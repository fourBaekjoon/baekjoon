import java.util.Scanner;

public class Main {
    public static int days, max;
    public static int[] t, p;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        days = sc.nextInt();
        t = new int[days];
        p = new int[days];
        for (int i = 0; i < days; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }

        process(0, 0);
        System.out.println(max);
    }

    public static void process(int idx, int total) {
        work(idx, total);
        rest(idx, total);
    }

    public static void work(int idx, int total) {
        if (idx + t[idx] <= days) {
            total += p[idx];
        }
        if (idx + t[idx] >= days) {
            max = Math.max(total, max);
            return;
        }
        idx += t[idx];
        process(idx, total);
    }

    public static void rest(int idx, int total) {
        if (idx + 1 >= days) {
            max = Math.max(total, max);
            return;
        }
        idx += 1;
        process(idx, total);
    }
}