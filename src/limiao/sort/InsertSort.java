package limiao.sort;
/**
 * 直接插入排序
 * @author limiao
 * @time 2016年4月4日 下午9:13:11
 */
public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int source[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		for(int i=1;i<source.length;i++){// 这里可以从1开始
			int temp = source[i];
//			for(int j=i-1;j>=0;j--){
//				if(source[j]>temp){    
//					source[j+1] = source[j];
//					source[j] = temp;
//				}
//			}
			// 将if和for结合,减少不必要的循环次数
			int j = 0;
			for(j=i-1;j>=0&&source[j]>temp;j--){
					source[j+1] = source[j];
			}
			source[j+1] = temp;
		}
		for(int m=0;m<source.length;m++){
			System.out.print(source[m]+" ");
		}
	}
}
