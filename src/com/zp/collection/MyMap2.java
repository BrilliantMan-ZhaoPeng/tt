package com.zp.collection;

import java.util.LinkedList;

/**
 * 自定义map的升级版，提高查询的效率
 * jdk的map的实现就是底层+链表
 * @author 25045
 *
 */
public class MyMap2 {
	LinkedList[] arr=new LinkedList[999];//数据是链表的类型
	
    int size;  //大小
    
    public void put(Object key,Object value) {
    	MyEntry entry=new MyEntry(key,value);
    	int hash=key.hashCode();
    	hash=(hash<0?-hash:hash);//判断是否为负数
    	int a=hash%arr.length;
    	
    	if(arr[a]==null) {//如果当前数据下标不存在链表
    		LinkedList list=new LinkedList();//创建一个链表
    		arr[a]=list;
    		list.add(entry);
    	}else {//如果当前数据下标已经存在链表了
    		//考虑覆盖的问题
    		LinkedList list=arr[a];
    		for(int i=0;i<list.size();i++) {
    			MyEntry entry1=(MyEntry)list.get(i);
    			if(entry1.key.equals(key)) {
    				entry1.value=value;
    				return ;
    			}
    		}
    		arr[a].add(entry);
    	}
    }

    
    public Object get(Object key) {
    	int hash=key.hashCode();
    	hash=(hash<0?-hash:hash);//判断是否为负数
    	 int a=hash%arr.length;
    	 if(arr[a]!=null) {
    		 //然后遍历list
    		 LinkedList list=arr[a];
    		 for(int i=0;i<list.size();i++) {
    			 MyEntry entry = (MyEntry)list.get(i);
    			 if(entry.key.equals(key)) {
    				 return entry.value;
    			 }
    		 }
    	 }
    	 return null;
    }
    public static void main(String[] args) {
		MyMap2 map2=new MyMap2();
		map2.put("1",1);
		map2.put("1",2);
		System.err.println(map2.get("1"));
	}
}
