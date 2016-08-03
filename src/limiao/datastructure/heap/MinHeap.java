package limiao.datastructure.heap;
/**
 * 堆数据结构
 * @author limiao
 * @time 2016年4月4日 下午10:44:11
 */
public class MinHeap {
	int source[];
	int realLength;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[] = {30,10,40,80,5};
		MinHeap heap = new MinHeap(s);
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
	
	public MinHeap(int a[]){
		this.source = a;
		this.realLength = a.length;
		makeMinHeap();
	}
	/**
	 * 构造堆
	 */
	public void makeMinHeap(){
		 for (int i = (realLength-1)/2; i >= 0; i--){
			 minHeapFixDown(i);
		 }  
	}
	
	/**
	 * 添加元素
	 * @param iNum 添加的元素值
	 */
	public void addNumber(int iNum){
		if(realLength < source.length){
			source[realLength] = iNum;
			minHeapFixUp(realLength);
		}else{
			int newArray[] = new int[realLength+1];
			for(int i=0;i<realLength;i++){
				newArray[i] = source[i];
			}
			source = newArray;
			source[realLength] = iNum;
			minHeapFixUp(realLength);
		}
		realLength++;
	}
	
	/**
	 * 删除元素，且每次只能删除根节点
	 */
	public void deleteNumber(){
		if(realLength>0){
			source[0] = source[source.length-1];
			realLength -=1;// 调之前就应改变长度
			minHeapFixDown(0);
		}
	}
	
    /**
     * 自上向下调整
     * @param i 从i节点开始调整
     */
    public void minHeapFixDown(int i){
		int temp = source[i];
		int j = 2*i+1;
		while(j<realLength){
			if(j+1<realLength&&source[j+1]<source[j]){
				j++;
			}
			if(temp<source[j]){
				break;
			}
			source[i] = source[j];
			i=j;
			j = 2*i+1;
		}
		source[i] = temp;
	}
    
	/**
	 * 自下向上调整
	 * @param i 添加的i节点
	 */
	public void minHeapFixUp(int i){
		int temp = source[i];
		int j = (i-1)/2;
		while(j>=0&&i!=0){
			if(source[j]<=temp){
				break;
			}
			source[i] = source[j]; 
			i=j;
			j = (i-1)/2;
		}
		source[i] = temp;
	}
}
