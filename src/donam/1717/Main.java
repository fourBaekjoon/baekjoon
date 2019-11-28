import java.util.Scanner;

public class Main {
    public static int[] ARR;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ARR = new int[n+1];
        for (int i = 0; i <= n; i++) {
            ARR[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int method = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (method == 0) {
                if (ARR[a] == ARR[b]) {
                    continue;
                }
                union(a, b);
            } else {
                if (find(a, b)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    public static boolean find(int a, int b) {
        return root(a) == root(b);
    }

    public static void union(int a, int b) {
        ARR[root(b)] = root(a);
    }

    public static int root(int v) {
        if (v == ARR[v]) {
            return v;
        }
        return ARR[v] = root(ARR[v]);
    }
}