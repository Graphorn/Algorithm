package limiao.algorithm.datastructure.list;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/**
 * 
 * @author limiao
 * @time 2016年5月17日 下午8:39:38
 */
public class MyLinkedList<AnyType> implements Iterable<AnyType> {

	private int theSize;
	private int modCount = 0;
	private Node<AnyType> beginMarker;
	private Node<AnyType> endMarker;
	
	private static class Node<AnyType>{
		public AnyType data;
		public Node<AnyType> prev;
		public Node<AnyType> next;
		
		public Node(AnyType d,Node<AnyType> p,Node<AnyType> n){
			data = d;
			prev = p;
			next = n;
		}
	}
	public MyLinkedList(){
		clear();
	}	
	public void clear(){
		beginMarker = new Node<AnyType>(null,null,null);
		endMarker = new Node<AnyType>(null,beginMarker,null);
		beginMarker.next = endMarker;
		theSize = 0;
		modCount++;
	}
	public int size(){
		return theSize;
	}
	public boolean isEmpty(){
		return size()==0;
	}
	public boolean add(AnyType x){
		add(size(),x);
		return true;
	}
	public void add(int index,AnyType x){
		addBefore(getNode(index),x);
	}
	public AnyType get(int index){
		return getNode(index).data;
	}
	public AnyType set(int index,AnyType newValue){
		Node<AnyType> p =getNode(index);
		AnyType oldValue = p.data;
		p.data = newValue;
		return oldValue;
	}
	public AnyType remove(int index){
		return remove(getNode(index));
	}
	private Node<AnyType> getNode(int index){
		Node<AnyType> p;
		if(index<0||index>size()){
			throw new IndexOutOfBoundsException();
		}
		if(index<size()/2){
			p = beginMarker.next;
			for(int i=0;i<index;i++){
				p=p.next;
			}
		}else{
			p = endMarker;
			for(int i=size();i>index;i--){
				p = p.prev;
			}
		}
		return p;
	}
	private void addBefore(Node<AnyType> p,AnyType x){
		Node<AnyType> newNode = new Node<AnyType>(null,p.prev,p);
		p.prev.next = newNode;
		p.prev = newNode;
		theSize++;
		modCount++;
	}
	private AnyType remove(Node<AnyType> p){
		p.next.prev = p.prev;
		p.prev.next = p.next;
		theSize--;
		modCount++;
		return p.data;
	}
	
	@Override
	public Iterator<AnyType> iterator() {
		// TODO Auto-generated method stub
		return new LinkedListIterator();
	}
	private class LinkedListIterator implements Iterator<AnyType>{

		private Node<AnyType> current = beginMarker.next;
		private int expectedModCount = modCount;
		private boolean okToRemove = false;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current!=endMarker;
		}

		
		@Override
		public AnyType next() {
			if(modCount != expectedModCount)
				throw new ConcurrentModificationException();
			
			return null;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
