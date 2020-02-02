package com.zp.collection;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

/**
 * 自定义实现LinkedList
 * 用双向链表实现
 * @author 25045
 *
 */
public class MyLinkedList {
	private Node first;// 表示的是第一个节点
	private Node last;// 表示的是下一个节点
	private int size; // 长度
	// 加入值到链表中去
	public void add(Object obj) {
		Node n = new Node();
		if (first == null) {// 当第一个节点为空的时候
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			first = n;
			last = n;
		} else {
			// 直接往后面加
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			last.setNext(n);
			last = n;
		}
		size++;
	}

	// 根据索引得到值
	public Object get(int index) {
		rangeCheckindex(index);
		Node tempNode = node(index);
		System.err.println(index+"-------"+tempNode.getObj());
		if(tempNode!=null) {
			return tempNode.getObj();
		}else {
			return null;
		}
	}

	// 判断索引的值是否合法的
	public void rangeCheckindex(int index) {
		if (index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
    //根据索引删除值
	public void remove(int index) {
		rangeCheckindex(index);
		Node tempNode=node(index);
		if(tempNode!=null) {
			 Node preNode =(Node)tempNode.getPrevious();
			 Node nextNode=(Node)tempNode.getNext();
			 if(preNode==null) {//表示处在第一个节点上
				 first=nextNode;
				 first.setPrevious(null);
			 }else if(nextNode==null) {//表示处于在最后的节点
				  preNode.setNext(null);
			 }else{
				 preNode.setNext(nextNode);
				 nextNode.setPrevious(preNode);
			 }
		}
         size--;
	}
	
	
	
	//插入值
	public void add(int index,Object obj) {
		rangeCheckindex(index);
		//根据索引的到节点的值
		Node tempNode = node(index);
		//需要插入的节点
		Node addNode=new Node();
		addNode.setObj(obj);
		//得到当前节点的前后节点
		if(tempNode!=null) {
			Node preNode=(Node)tempNode.getPrevious();
			Node nextNode=(Node)tempNode.getNext();
			if(preNode==null) {//意味着当前节点处于第一个节点
				addNode.setNext(tempNode);
				tempNode.setPrevious(addNode);
				first=addNode;
			}else if(nextNode==null) {//意味着当前的节点处于最后一个节点
				tempNode.setNext(addNode);
				addNode.setPrevious(tempNode);
				last=addNode;
			}else {
				preNode.setNext(addNode);
				addNode.setPrevious(preNode);
				addNode.setNext(tempNode);
				nextNode.setPrevious(addNode);
			}
			size++;
		}
	}
	
	/**
	 * 根据索引查询节点
	 * @param index
	 * @return
	 */
	public Node node(int index) {
		Node tempNode=null;
		if(first!=null) {
			if(index<size>>1) {
				tempNode=first;
				for(int i=0;i<index;i++) {
					tempNode=(Node)tempNode.getNext();
				}
			}else {
				tempNode=last;
				for(int i=size-1;i>index;i--) {
					tempNode=(Node)tempNode.getPrevious();
				}
			}
		}
		return tempNode;
	}
	//得到长度
	public int size() {
		return size;
	}
}
