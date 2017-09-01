package limiao.other;

import java.util.Scanner;

/**
 * 求数组的连续子序列的最大和
 * @author limiao
 * @time 2017年8月26日 下午7:37:02
 */
public class MaxSubsquence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String[] strings = scanner.nextLine().trim().split(" ");
		int[] nums = new int[strings.length];
		for(int x=0; x<strings.length; x++) {
			nums[x] = Integer.parseInt(strings[x]);
		}
		System.out.println(getMaxSubArray(nums));
	}

	public static int getMaxSubArray(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int maxEndingHere = 0;
		int maxSoFar = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (maxEndingHere < 0) {
				maxEndingHere = 0;
			}
			maxEndingHere += nums[i];
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}
}
