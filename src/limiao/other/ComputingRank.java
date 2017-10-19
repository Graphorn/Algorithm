package limiao.other;


/*
 * 计算名次
 */
public class ComputingRank {

	public static void main(String[] args) {
		int result[] = rank(rank(new int[]{7,2,5,0}));
		for(int x=0; x<result.length; x++) {
			System.out.println(result[x]);
		}
	}
	
	/**
	 * @param source 输入的对戏那个数组
	 * @return 对应的名次
	 */
	public static int[] rank(int[] source) {
		int len = source.length;
		int[] rank = new int[len];
		for(int x=0; x<len; x++) {
			for(int y=x+1; y<len; y++) {
				if(source[y]<=source[x]) {
					rank[x] ++;
				}else {
					rank[y] ++;
				}
				for(int i=0; i<rank.length; i++) {
					System.out.print(rank[i]+" ");
				}
				System.out.println();
			}
		}
		return rank;
	}

}
