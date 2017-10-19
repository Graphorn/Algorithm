package limiao.sort;


/**
 * 快速排序
 * @author limiao
 * @time 2016年4月5日 下午6:58:03
 */
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort quickSort = new QuickSort();
		int source[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		quickSort.quickSort(source,0,source.length-1);
		for(int i=0;i<source.length;i++){
			System.out.print(source[i]+" ");
		}
		
		System.out.println(quickSort.quickSelectIteration(source, 4));
		System.out.println(quickSort.quickSelectRecursion(source, 0, source.length-1, 4));
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
	 * 递归寻找数组的第K小
	 * @param list 数组
	 * @param k 
	 * @return 第k小的数
	 */
	public int quickSelectRecursion(int[] list, int low, int high, int k) {
		if(list == null || list.length<k || high<low || high<0 || high>list.length-1 || low<0 || low>list.length-1) return Integer.MIN_VALUE;
		int s = partition(list, low, high);
		if(s == k-1) {
			return list[s];
		}
		else if(s>k-1) {
			return quickSelectRecursion(list, low, s-1, k);
		}else {
			return quickSelectRecursion(list, s+1, high, k);
		}
	}
	
	/**
	 * 迭代寻找数组的第k小,不对k进行调整
	 * @param list 数组
	 * @param k
	 */
	public int quickSelectIteration(int[] list, int k) {
		if(list == null || list.length<k) return Integer.MIN_VALUE;
		int s = 0;
		int low = 0;
		int high = list.length-1;
		s = partition(list, low, high);
		while(k-1 != s){
			if(s>k-1) s = partition(list, low, s-1);
			else s = partition(list, s+ 1, high);
		}
		return list[s];
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
        		int tmp = list[s];
        		list[s] = list[i];
        		list[i] = tmp;
        	}
        }
        // 交换小于p的序列的最后一个数和p
        list[low] = list[s];
        list[s] = p;
        return s; //返回中轴的位置    
	}  

	
}
