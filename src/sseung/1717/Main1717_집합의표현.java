import java.util.Scanner;

public class Main1717_집합의표현 {
	public static int[] arr;
	public static int n, m;
	
	public static int find(int root) {
		if(arr[root]==root) return root;
		else return arr[root] = find(arr[root]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n+1];
		
		for (int i = 1; i < n+1; i++) {
			arr[i] = i;
		}
		
		for (int i = 0; i < m; i++) {
			int num = sc.nextInt();
			int a = find(sc.nextInt());
			int b = find(sc.nextInt());
			
			if(num==0 && a==b) continue;
			else if(num==0 && a!=b) arr[b] = a;
			else if(num==1 && a==b) System.out.println("yes");
			else System.out.println("no");
		}
	}
}
