package limiao.algorithm.leetcode;

/**
 * 88. Merge Sorted Array
 * @author seektech
 * Oct 26, 2016 3:45:16 PM
 */
public class No_088_MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {0,3,4};
		int nums2[] = {1,4,5,7};
		merge(nums1,3,nums2,4);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m-1; 
		int j = n-1;
		int k = n+m-1;
		
		while(j>=0){
			if(i>=0 && nums1[i]>=nums2[j]){
				nums1[k--] = nums1[i--];
			}else{
				nums1[k--] = nums2[j--];
			}
		}
	}
	
	/**
	 * 当m就表示nums1的元素个数时需要建立另外一个数组
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
	public static void merge1(int[] nums1, int m, int[] nums2, int n) {
		int p1;
		int p2;
		int j = 0;
		int tar = 0;
		int result[] = new int[n+m];
        for(int i=0; i<n; i++){
        	p2 = nums2[i];
        	for(; j<m; j++){
        		p1 = nums1[j];
        		if(p1<=p2){
        			result[tar] = p1;
        			tar++;
        		}else{
        			break;
        		}
        	}
        	result[tar] = p2;
        	tar++;
        }
        nums1 = result;
        for(int i=0; i<nums1.length; i++){
        	System.out.print(result[i]+" ");
        }
    }
}
