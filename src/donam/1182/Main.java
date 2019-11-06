import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int R = 0;
    public static int N = 0;
    public static int S = 0;
    public static int[] SEQ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.nextInt();
        SEQ = new int[N];
        for (int i = 0; i < N; i++) {
            SEQ[i] = sc.nextInt();
        }

        process(new ArrayList(), 0);

        System.out.println(R);
    }

    public static void process(ArrayList<Integer> seq, int idx) {
        if (idx == N) {
            int s = 0;
            for (int v : seq) {
                s += v;
            }
            if (s == S && seq.size() > 0) {
                R += 1;
            }
            return;
        }


        include((ArrayList<Integer>)seq.clone(), idx);
        exclude((ArrayList<Integer>)seq.clone(), idx);
    }

    public static void include(ArrayList<Integer> seq, int idx) {
        seq.add(SEQ[idx]);
        process((ArrayList<Integer>)seq.clone(), idx+1);
    }

    public static void exclude(ArrayList<Integer> seq, int idx) {
        process((ArrayList<Integer>)seq.clone(), idx+1);
    }
}