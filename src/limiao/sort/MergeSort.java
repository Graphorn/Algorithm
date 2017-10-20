package limiao.sort;

/**
 * 归并排序
 * 
 * @author limiao
 * @time 2016年4月6日 下午5:59:43
 */
public class MergeSort {
//	public static void main(String[] args) {
//		// int[] array = { 9, 1, 5, 3, 4, 2, 6, 8, 7 };
//		MergeSort mergeSort = new MergeSort();
//		int[] array = mergeSort.getrandomarray(100);
//		long startTime = System.nanoTime(); // 获取开始时间
//		// mergeSort.sortAgglomeration(array);
//		mergeSort.sortDivisive(array, 0, array.length - 1);
//		long endTime = System.nanoTime(); // 获取结束时间
//		System.out.println("程序运行时间： " + (endTime - startTime) / 1000 + "us");
//		System.out.print("排序后:\t\t");
//		mergeSort.printAll(array);
//	}
	
	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		for(int i=1; i<=10; i++) {
			int[] array = mergeSort.getrandomarray(i*100);
			long startTime = System.nanoTime(); // 获取开始时间
			// mergeSort.sortAgglomeration(array);
			mergeSort.sortDivisive(array, 0, array.length - 1);
			long endTime = System.nanoTime(); // 获取结束时间
			System.out.println("mergeSort运行时间： " + (endTime - startTime) / 1000 + "us");
			
			startTime = System.nanoTime(); // 获取开始时间
			mergeSort.quickSort(array, 0, array.length-1);
			endTime = System.nanoTime(); // 获取结束时间
			System.out.println("quickSort运行时间： " + (endTime - startTime) / 1000 + "us");
			
			System.out.print("排序后:\t\t");
			mergeSort.printAll(array);
		}
		
	}

	/**
	 * @param array
	 *            被分裂的数组
	 * @param start
	 *            被分裂的数组的开始坐标
	 * @param end
	 *            被分裂的数组的结束坐标
	 */
	public void sortDivisive(int[] array, int start, int end) {
		if (array != null && start < end) {
			// 可以设定一个最小规模，当规模小于一定量的时候利用插入排序
			int middle = (start + end) / 2;
			sortDivisive(array, start, middle);
			sortDivisive(array, middle + 1, end);
			merge(array, start, middle, middle + 1, end);
		}
	}

	/**
	 * 归并排序的变化版本，自底向上的合并一个个元素对， 再合并有序对，避免使用堆栈处理递归调用
	 */
	public int[] sortAgglomeration(int[] array) {
		if (array == null)
			return null;

		int length = array.length;
		if (length <= 1)
			return array;

		for (int w = 1; w <= length / 2; w = 2 * w) {
			// 归并长度为w的两个相邻子序列
			for (int i = 0; i + 2 * w - 1 < length; i = i + 2 * w) {
				merge(array, i, i + w - 1, i + w, i + 2 * w - 1);
			}
			System.out.print("gap = " + w + ":\t");
			this.printAll(array);
		}
		// 如果原数组长度为奇数，需要将最后一个数和前n-1个数进行merge
		if (length % 2 == 1) {
			merge(array, 0, length - 2, length - 1, length - 1);
		}
		return array;
	}

	/**
	 * 合并两个相邻的序列
	 * 
	 * @param array
	 *            原数组
	 * @param start1
	 *            第一段序列的开始坐标
	 * @param end1
	 *            第一段序列的结束坐标
	 * @param start2
	 *            第二段序列的开始坐标
	 * @param end2
	 *            第二段序列的结束坐标
	 */
	public void merge(int[] array, int start1, int end1, int start2, int end2) {
		int i = start1; // i是第一段序列的开始坐标
		int j = start2; // j是第二段序列的开始坐标
		int k = 0; // k是临时存放合并序列的下标
		int[] arrayTmp = new int[end2 - start1 + 1]; // arrayTmp是临时合并序列
		// 扫描第一段和第二段序列，直到有一个扫描结束
		while (i <= end1 && j <= end2) {
			// 判断第一段和第二段取出的数哪个更小，将其存入合并序列，并继续向下扫描
			if (array[i] <= array[j])
				arrayTmp[k] = array[i++];
			else
				arrayTmp[k] = array[j++];
			k++;
		}
		// 若第一段序列还没扫描完，将其全部复制到合并序列
		while (i <= end1)
			arrayTmp[k++] = array[i++];
		// 若第二段序列还没扫描完，将其全部复制到合并序列
		while (j <= end2)
			arrayTmp[k++] = array[j++];
		// 将合并序列复制到原始序列中
		for (k = 0, i = start1; i <= end2; i++, k++) {
			array[i] = arrayTmp[k];
		}
	}

	// 打印完整序列
	public void printAll(int[] list) {
		for (int value : list) {
			System.out.print(value + "\t");
		}
		System.out.println();
	}

	/**
	 * 生成包含log个随机数的数组
	 * 
	 * @param log
	 * @return
	 */
	public int[] getrandomarray(int log) {
		int[] result = new int[log];
		for (int i = 0; i < log; i++) {
			result[i] = i;
		}
		for (int i = 0; i < log; i++) {
			int random = (int) (log * Math.random());
			int temp = result[i];
			result[i] = result[random];
			result[random] = temp;
		}
		return result;
	}
	
	/**
	 * @param list 原始数组
	 * @param low 被排序的数组的开始坐标
	 * @param high 被排序的数组的结束坐标
	 */
	public void quickSort(int[] list, int low, int high) {    
        if (list != null && low < high){    
           int middle =partition(list, low, high);  //将list数组进行一分为二    
           quickSort(list, low, middle - 1);       //对低字表进行递归排序    
           quickSort(list,middle + 1, high);       //对高字表进行递归排序    
        }    
    }  
	
	/**
	 * @param list 数组
	 * @param low 开始坐标
	 * @param high 结束坐标
	 * @return
	 */
	public int partition(int[] list, int low, int high) {    
        int p =list[low];    //数组的第一个作为中轴
        int s = low;
        // 将小于中轴的数排在大于等于中轴的数之前
        for(int i=low+1; i<=high; i++) {
        	if(list[i] < p) {
        		s += 1;
//        		int tmp = list[s];
//        		list[s] = list[i];
//        		list[i] = tmp;
        		exchange(list, s, i);
        	}
        }
        // 交换小于p的序列的最后一个数和p
        list[low] = list[s];
        list[s] = p;
        return s; //返回中轴的位置    
	}  
	public void exchange(int[] list, int i, int j) {
		int tmp = list[i];
		list[i] = list[j];
		list[j] = tmp;
	}
}
