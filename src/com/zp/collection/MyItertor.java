package com.zp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.tools.JavaCompiler;

/**
 * hasnext
 * next
 * remove
 * 迭代器原理
 * @author 25045
 *
 */
public class MyItertor implements java.lang.Iterable{
	private String [] elem= {"a","b","c","d","e","f"};
	
	private int size=elem.length;
	/**
	 * 判断是否存在下一个元素
	 * @return
	 */
	private  class MyIt implements Iterator<String>{
		private int cursor=-1;
		/**
		 * 获取下一个元素
		 * @return
		 */
		public String next() {
			cursor++;
			return elem[cursor];
		}
		//删除元素	
		public void remove(){
			//暂时不实现这个
		}

		@Override
		public boolean hasNext() {
			return cursor<size-1;
		}
	}
	
	//提供外部的访问
	public Iterator<String> iterator(){
		return new MyIt();
	}
	public static void main(String[] args) {
		MyItertor list=new MyItertor();
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.err.println(it.next());
		}
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("11");
		list1.add("22");
		Iterator<String> iterator = list1.iterator();
		while (iterator.hasNext()) {
          System.err.println(iterator.next());			
		}
	}
}
