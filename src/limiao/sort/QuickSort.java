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
		if(source.length>0){
			quickSort.quickSort(source,0,source.length-1);
		}
		for(int i=0;i<source.length;i++){
			System.out.print(source[i]+" ");
		}
	}

	public int getMiddle(int[] list, int low, int high) {    
        int tmp =list[low];    //数组的第一个作为中轴    
        while (low < high){    
            while (low < high&&list[high] >= tmp) {    
               high--;    
            }    
            list[low] =list[high];   //比中轴小的记录移到低端    
            while (low < high&&list[low] <= tmp) {    
                low++;    
            }    
            list[high] =list[low];   //比中轴大的记录移到高端    
        }    
        list[low] = tmp;              //中轴记录到尾    
        return low;                   //返回中轴的位置    
	}  

	public void quickSort(int[] list, int low, int high) {    
        if (low < high){    
           int middle =getMiddle(list, low, high);  //将list数组进行一分为二    
           quickSort(list, low, middle - 1);       //对低字表进行递归排序    
           quickSort(list,middle + 1, high);       //对高字表进行递归排序    
        }    
    }  
}
