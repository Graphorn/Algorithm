package limiao.algorithm.sort;

/**
 * 希尔排序
 * @author limiao
 * @time 2016年4月5日 上午9:13:11
 */
public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int source[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		for(int gap=source.length/2;gap>=1;gap/=2){
			for(int m=gap;m<source.length;m++){
				int temp = source[m];
				for(int j=m-gap;j>=0&&source[j]>temp;j-=gap){
					source[j+gap] = source[j];
					source[j] = temp;
				}
			}
		}
		for(int m=0;m<source.length;m++){
			System.out.print(source[m]+" ");
		}
	}

}
