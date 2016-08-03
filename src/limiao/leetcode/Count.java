package limiao.leetcode;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		Scanner s = new Scanner(System.in);
		int aaaa = s.nextInt();
		String sss = s.nextLine().toString();
		int all = 3;
		int a[][] = new int[all][];
		for(int i=0;i<all;i++){
			String string = s.nextLine().toString();
			System.out.println(string);
			String t[] = string.split(" ");
			int tt[] = new int[t.length];
			for(int j=0;j<t.length;j++){
				System.out.println(t[j]);
				tt[j] = Integer.parseInt(t[j]);
			}
			a[i] = tt;
		}
		for(int i=0;i<a.length;i++){
			for(int m=0;m<a[i].length;i++){
				for(int n = m; n<a[i].length;i++){
					if(a[i][m]>a[i][n]){
						int temp = a[i][n];
						a[i][n] = a[i][m];
						a[i][m] = temp;
						c++;
					}
				}
			}
			System.out.println(c);
			c = 0;
		}
	}

}
