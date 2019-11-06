import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == j) {
                    continue;
                }
                if (map.get(compositeKey(i, j)) != null) {
                    continue;
                }
                int[] res = process(arr, i, j);
                if (res != null) {
                    print(res);
                    return;
                }
                map.put(compositeKey(i, j), true);
            }
        }
    }

    public static String compositeKey(int a, int b) {
        return Integer.toString(Math.min(a, b)) + "," + Integer.toString(Math.max(a, b));
    }

    public static int[] process(int[] arr, int e1, int e2) {
        int idx = 0, sum = 0;
        int[] res = new int[7];
        for (int i = 0; i < 9; i++) {
            if (i != e1 && i != e2) {
                sum += arr[i];
                res[idx++] = arr[i];
            }
        }
        if (sum != 100) {
            return null;
        }
        return res;
    }

    public static void print(int[] l) {
        for (int v : l) {
            System.out.println(v);
        }
    }
}