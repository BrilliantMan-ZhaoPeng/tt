package com.zp.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.tools.ForwardingFileObject;

public class Test1 {
  public static void main(String[] args) {
    	 List list=new ArrayList(); 
    	 list.add("aaa");
    	 list.add("bbb");
    	 list.add("ccc");
    	 for (int i=0;i<list.size();i++) {
			System.err.println(list.get(i));
		}
    	 System.err.println("----------------------------------------");
    	 //是无序的不能循环遍历的
    	 Set set=new HashSet();
    	 set.add("aaa");
    	 set.add("bbb");
    	 set.add("ccc");
    	 /*Iterator iterator = set.iterator();
    	 while(iterator.hasNext()) {
    		 System.err.println(iterator.next());
    	 }*/
    	 for(Iterator iterator=set.iterator();iterator.hasNext();) {
    		 System.err.println(iterator.next());
    	 }
    	 
}
}
