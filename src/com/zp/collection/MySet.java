package com.zp.collection;
/**
 * 自己定义的HashSet
 * @author 25045
 *
 */

import java.util.HashMap;

public class MySet {
	 HashMap map;
	 private static final Object PERSENT=new Object();
	 public MySet() {
		 map=new HashMap();
	 }
	 public int size() {
		 return map.size();
	 }
	 public void add(Object obj) {
		 map.put(obj, PERSENT); 
	 }
	 public static void main(String[] args) {
		MySet set=new MySet();
		set.add("aa");
		set.add("aa");
		System.err.println(set.size());
	}
}
