package limiao.algorithm.datastructure.heap;

/**
 * 最大堆
 * @author limiao
 * @time 2016年4月5日 下午2:52:51
 */
public class MaxHeap {
	int source[];
	int realLength;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {30,10,40,80,5};
		MaxHeap heap = new MaxHeap(a);
		System.out.println("构造堆");
		for(int i=0;i<heap.realLength;i++){
			System.out.print(heap.source[i]+" ");
		}
		System.out.println();
		System.out.println("在满的情况下添加元素，数组扩展");
		heap.addNumber(2);
		for(int i=0;i<heap.realLength;i++){
			System.out.print(heap.source[i]+" ");
		}
		System.out.println();
		System.out.println("删除根节点");
		heap.deleteNumber();
		for(int i=0;i<heap.realLength;i++){
			System.out.print(heap.source[i]+" ");
		}
		System.out.println();
		System.out.println("在未满的情况下添加元素");
		heap.addNumber(1);
		for(int i=0;i<heap.realLength;i++){
			System.out.print(heap.source[i]+" ");
		}
	}

	public MaxHeap(int a[]){
		this.source = a;
		this.realLength = a.length;
		makeMaxHeap();
	}
	
	/**
	 * 构造最大堆
	 */
	public void makeMaxHeap(){
		for(int i=(realLength-1)/2;i>=0;i--){
			maxHeapFixDown(i);
		}
	}
	
	/**
	 * 插入元素
	 * @param iNum 元素值
	 */
	public void addNumber(int iNum){
		if(realLength < source.length){
			source[realLength] = iNum;
			maxHeapFixUp(realLength);
		}else{
			int newArray[] = new int[realLength+1];
			for(int i=0;i<realLength;i++){
				newArray[i] = source[i];
			}
			source = newArray;
			source[realLength] = iNum;
			maxHeapFixUp(realLength);
		}
		realLength++;
	}
	
	/**
	 * 删除根节点
	 */
	public void deleteNumber(){
		if(realLength>0){
			source[0] = source[realLength-1];
			realLength -=1;// 调之前就应改变长度
			maxHeapFixDown(0);
		}
	}
	
	/**
	 * 自下而上调整
	 * @param i 调整i节点
 	 */
	public void maxHeapFixUp(int i){
		int temp = source[i];
		int j = (i-1)/2;
		while(j>=0&&i!=0){
			if(source[j]>=temp){
				break;
			}
			source[i] = source[j];
			i = j;
			j = (i-1)/2;
		}
		source[i] = temp;
	}
	
	/**
	 * 自上而下调整
	 * @param i 调整 i节点
	 */
	public void maxHeapFixDown(int i){
		int temp = source[i];
		int j = 2*i + 1;
		while(j<realLength){
			if(j+1<realLength&&source[j+1]>source[j]){
				j++;
			}
			if(temp>source[j]){
				break;
			}
			source[i] = source[j];
			i = j;
			j = 2*i + 1;
		}
		source[i] = temp;
	}
}
