import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int r = 0;
        final int g = 1;
        final int b = 2;
        int n = sc.nextInt();
        int[][] p = new int[n][3];
        for (int i = 0; i < n; i++) {
            p[i][r] = sc.nextInt();
            p[i][g] = sc.nextInt();
            p[i][b] = sc.nextInt();
        }

        int[][] mp = new int[n][3];
        mp[0] = p[0];
        for (int i = 1; i < n; i++) {
            mp[i][r] = Math.min(mp[i-1][g], mp[i-1][b]) + p[i][r];
            mp[i][g] = Math.min(mp[i-1][r], mp[i-1][b]) + p[i][g];
            mp[i][b] = Math.min(mp[i-1][r], mp[i-1][g]) + p[i][b];
        }

        int min = 0;
        min = Math.min(mp[n-1][r], mp[n-1][g]);
        min = Math.min(min, mp[n-1][b]);

        System.out.println(min);
    }
}