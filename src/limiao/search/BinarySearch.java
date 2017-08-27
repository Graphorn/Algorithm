package limiao.search;

/**
 * 二分查找，递归和非递归实现
 * 
 * @author limiao
 * @time 2016年5月12日 下午9:50:44
 */
public class BinarySearch {

	int array[];

	int des;

	int resultC;// 递归实现的输出的结果

	int resultL;// 非递归实现的结果

	/**
	 * 递归实现
	 * 
	 * @param array
	 *            整数数组
	 * @param start
	 *            当次查找开始的坐标,从0开始
	 * @param end
	 *            当次查找结束的坐标,最大为长度-1
	 * @param des
	 *            查找的值
	 */
	public int recursionBinarySearch(int array[], int start, int end, int des) {
		if (array.length == 0) {
			System.out.println("请输入正确的有序数组");
			return -1;
		}
		if (start <= end && start >= 0 && end < array.length) {
			int mid = (start + end) / 2;
			if (des == array[mid]) {
				return mid;
			} else if (des > array[mid]) {
				return recursionBinarySearch(array, mid + 1, end, des);
			} else if (des < array[mid]) {
				return recursionBinarySearch(array, start, mid - 1, des);
			} else {
				return -1;
			}
		} else {
			System.out.println("请输入正确的开始和结束的编号");
			return -1;
		}
	}

	/**
	 * 非递归
	 * 
	 * @param array
	 *            整数数组
	 * @param start
	 *            当次查找开始的坐标,从0开始
	 * @param end
	 *            当次查找结束的坐标,最大为长度-1
	 * @param des
	 *            查找的值
	 */
	public int loopBinarySearch(int array[], int start, int end, int des) {
		if (array.length == 0) {
			System.out.println("请输入正确的有序数组");
			return -1;
		}
		if (start <= end && start >= 0 && end < array.length) {
			int mid = -1;
			while (start <= end) {
				mid = (start + end) / 2;
				if (des > array[mid]) {
					start = mid + 1;
				}
				if (des < array[mid]) {
					end = mid - 1;
				}
				if (des == array[mid]) {
					return mid;
				}
			}
			return mid;
		} else {
			return -1;
		}
	}

	/**
	 * @param array 整数数组
	 * @param start 当次查找开始的坐标,从0开始
	 * @param end 当次查找结束的坐标,最大为长度-1
	 * @param des 查找的元素的值
	 * @return 所查找值的坐标，失败则为-1
	 */
	public int betterLoopBinarySearch(int[] array, int start, int end, int des) {
		int mid = -1;
		while(end>start+1){
			mid = (start+end)/2;
			if(array[mid]>=des){// 不能搜索最右边的元素
				end = mid;
			}else{
				start =mid;
			}
		}
		if(array[end] == des){
			return end;
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		binarySearch.array = new int[] { 1, 3, 5, 7, 9, 10 };
		binarySearch.des = 9;
		// 递归测试结果
		binarySearch.resultC = binarySearch.recursionBinarySearch(
				binarySearch.array, 0, binarySearch.array.length - 1,
				binarySearch.des);
		// 非递归测试结果
		binarySearch.resultL = binarySearch.betterLoopBinarySearch(
				binarySearch.array, 0, binarySearch.array.length - 1,
				binarySearch.des);
		// 改进的非递归测试结果
		
		System.out.println("递归查找:" + binarySearch.resultC + "非递归查找:"
				+ binarySearch.resultL);
	}

}
