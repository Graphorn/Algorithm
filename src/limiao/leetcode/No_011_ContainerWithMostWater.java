package limiao.leetcode;

/**
 * 11. Container With Most Water
 * @author seektech
 * @time Nov 15, 2016 11:32:56 AM
 */
public class No_011_ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = {2,4,3,5,6,1,4};
		System.out.println(maxArea(height));
	}
	public static int maxArea(int[] height) {
		/*
		int left = 0;
		int v = 0;
		for(int i=0; i<height.length; i++){
			int right = 0;
			if(height[i]<left){
				continue;
			}else{
				left = height[i];
			}
			for(int j=height.length-1; j>i; j--){
				if(right <= left){
					if(height[j]<right){
						continue;
					}else{
						right = height[j];
					}
				}
				int h = left<=right?left:right;
				int sum = h*(j-i);
				v = sum>v?sum:v;
			}
		}
	    return v;
	    **/
		int left = 0;
		int right = height.length-1;
		int heightL = 0;
		int heightR = 0;
	
		int v = 0;
		while(left < right){
			heightL = height[left];
			heightR = height[right];
			int sum = (right-left)*(heightL>heightR?heightR:heightL);
			v = sum>v?sum:v;
			if(height[left] <= height[right]){
				left++;
			}else
				right--;
		}
		return v;
	}
}
