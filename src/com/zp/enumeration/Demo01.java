package com.zp.enumeration;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import javax.xml.bind.ValidationEvent;

/**
 * Enumeration的使用
 * 1.判断hasMoreElements()
 * 2.获取nextElement()
 * @author 25045
 *
 */
public class Demo01 {
   public static void main(String[] args) {
	Vector<String> vector=new Vector<String>();
	vector.add("javase");
	vector.add("htmljavase");
	vector.add("css");
	//遍历该容器
	Enumeration<String> en=vector.elements();
	while(en.hasMoreElements()) {
		System.err.println(en.nextElement());
	}
	
   Iterator<String> iterator = vector.iterator();	
   while(iterator.hasNext()) {
	   System.err.println(iterator.next());
   }
}
}
