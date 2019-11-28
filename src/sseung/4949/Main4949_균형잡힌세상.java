import java.util.ArrayList;
import java.util.Scanner;

public class Main4949_균형잡힌세상 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.nextLine();
			ArrayList<Character> list = new ArrayList<>();
			boolean flag = true;
			
			if(s.equals(".")) break;
			
			char c;
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				
				if(c=='(' || c=='[') list.add(c);
				else if(c==')') {
					if(list.size()>0 && list.get(list.size()-1)=='(') list.remove(list.size()-1);
					else {
						flag = false;
						break;
					}
				}else if(c==']') {
					if(list.size()>0 && list.get(list.size()-1)=='[') list.remove(list.size()-1);
					else {
						flag = false;
						break;
					}
				}
			}
			if(flag==true && list.size()==0) System.out.println("yes");
			else System.out.println("no");
		}
	}
}
