package limiao.algorithm.sort;

import javax.management.MXBean;

import limiao.datastructure.heap.MaxHeap;

/**
 * 堆排序，从小到大排列，利用最大堆
 * @author limiao
 * @time 2016年4月5日 下午2:55:28
 */
public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapSort heapSort = new HeapSort();
		int source[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		//构造堆
		for(int i=(source.length-1)/2;i>=0;i--){
			heapSort.maxHeapFixDown(source,i,source.length);
		}
		for(int i=0;i<source.length;i++){
			System.out.print(source[i]+" ");
		}
		System.out.println();
		for(int j=0;j<source.length;j++){
			int temp = source[0];
			source[0] = source[source.length-1-j];
			source[source.length-1-j] = temp;
			heapSort.maxHeapFixDown(source, 0, source.length-1-j);
		}
		for(int i=0;i<source.length;i++){
			System.out.print(source[i]+" ");
		}
	}
	public void maxHeapFixDown(int a[],int i,int n){
		int temp = a[i];
		int j = 2*i+1;
		while(j<n){
			if(j+1<n&&a[j+1]>a[j]){
				j++;
			}
			if(temp>a[j]){
				break;
			}
			a[i] = a[j];
			i = j;
			j = 2*i+1;
		}
		a[i] = temp;
	}
}
