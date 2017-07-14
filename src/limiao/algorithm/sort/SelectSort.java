package limiao.algorithm.sort;

/**
 * 简单选择排序
 * @author limiao
 * @time 2016年4月5日 上午10:04:38
 */
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int source[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		for(int i=0;i<source.length;i++){
			int min = i;
			for(int j=i+1;j<source.length;j++){
				if(source[j]<source[min]){
					min = j;
				}
			}
			int temp = source[i];
			source[i] = source[min];
			source[min] = temp;
		}
		for(int m=0;m<source.length;m++){
			System.out.print(source[m]+" ");
		}
	}

}
