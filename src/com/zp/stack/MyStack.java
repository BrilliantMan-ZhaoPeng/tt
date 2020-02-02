package com.zp.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack<E> {
	//创建一个队列的容器
    private Deque<E> container=new ArrayDeque<E>();
    //容量的大小
    private int cap;
	public MyStack(int cap) {
		super();
		this.cap = cap;
	}
     
    //压栈的实现
	public boolean push(E e) {
		if(container.size()+1>cap) {
			return false;
		}
		return container.offerLast(e);//在队列的末尾添加值
	}
	//弹栈的实现
	public E pop() {
		return container.pollLast();//从末尾开始取值，并实现删除
	}
	
	//获取
	public E peek() {
		return container.peekLast();//查询并不删除
	}
	
	//size的大小
	public int size() {
		return container.size();
	}
    
}
