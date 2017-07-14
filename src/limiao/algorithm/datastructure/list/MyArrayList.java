package limiao.algorithm.datastructure.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * ArrayList的数组实现
 * @author limiao
 * @time 2016年5月14日 下午4:52:17
 */
/**
 * @param <AnyType>
 * @author limiao
 * @time 2016年5月17日 下午6:34:29
 */
public class MyArrayList<AnyType> implements Iterable<AnyType> {

	private static final int DEFAULT_CAPACITY = 10;// 默认容量
	
	private int theSize;// 当前拥有的数据的真实的大小
	private AnyType[] theItems;// 数据成员
	
	
	/**
	 * 测试函数
	 */
	public static void main(String[] args) {

	}

	/**
	 * 构造函数
	 */
	public MyArrayList(){
		clear();// 创建实例的时候将内部数据清空
	}
	
	
	/**
	 * 清除函数
	 */
	public void clear(){
		theSize = 0;// 将当前大小置0
		ensureCapacity(DEFAULT_CAPACITY);// 将容量调整至默认的大小
	}
	
	/**
	 * 当前的大小
	 */
	public int size(){
		return theSize;
	}
	
	public boolean isEmpty(){
		return size()==0;
	}
	
	public void trimToSize(){
		ensureCapacity(size());
	}
	/**
	 * 按索引获取元素
	 * @param index 索引
	 * @return 返回相应的元素
	 */
	public AnyType get(int index){
		if(index<0||index>=size()){
			throw new ArrayIndexOutOfBoundsException();
		}
		return theItems[index];
	}
	
	public void set(int index, AnyType newValue){
		if(index<0||index>=size())
			throw new ArrayIndexOutOfBoundsException();
		theItems[index] = newValue;
	}
	
	/**
	 * 扩容函数
	 * @param newCapacity
	 */
	public void ensureCapacity(int newCapacity){
		if(newCapacity < theSize){// 如果新的数组的大小小于原来的数组的大小，那么就直接返回，不做任何操作
			return;
		}
		AnyType[] old = theItems;
		theItems = (AnyType[]) new Object[newCapacity];
		for(int i = 0;i<size();i++){
			theItems[i] = old[i];
		}
	}
	
	/**
	 * 直接在list的最后添加
	 */
	public void add(AnyType x){
	}

	/**
	 * 在list的指定位置添加
	 */
	public void add(int index,AnyType x){
		if(theItems.length == size()){
			ensureCapacity(size()*2+1);
		}
		// 这个for循环很重要
		for(int i=theSize;i>index;i--){
			theItems[i] = theItems[i-1];
		}
		theItems[index] = x;
		theSize++;
	}
	
	public AnyType remove(int index){
		AnyType removeItem = theItems[index]; 
		// 这个for循环很重要
		for(int i=index;i<size()-1;i++){
			theItems[i] = theItems[i+1];
		}
		theSize--;
		return removeItem;
	}
	
	@Override
	public Iterator<AnyType> iterator() {
		// TODO Auto-generated method stub
		return new ArrayListIterator(this);
	}

	private class ArrayListIterator implements Iterator<AnyType>{

		private int current = 0;
		private MyArrayList<AnyType> theList;
		public ArrayListIterator(MyArrayList<AnyType> list){
			theList = list;
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current < theList.size();
		}

		@Override
		public AnyType next() {
			// TODO Auto-generated method stub
			if(!hasNext())
				throw new NoSuchElementException();
			return theList.theItems[current++];
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			theList.remove(--current);// 这里貌似有点问题！
		}
		
	}
}
