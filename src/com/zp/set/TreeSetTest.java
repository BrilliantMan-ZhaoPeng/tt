package com.zp.set;

import java.util.Comparator;
import java.util.TreeSet;
/**
 * 在添加的过程中就开始排序，数据更改不会影响原来的数据,不要修改数据，否则可能重复，，，，可以利用final来修饰数据
 * @author 25045
 *
 */
public class TreeSetTest {
   public static void main(String[] args) {
	   Person p=new Person("张三", 12);
	   Person p1=new Person("张三", 15);
	   Person p2=new Person("张三", 10);
	   Person p3=new Person("张三", 4);
       TreeSet ts=new TreeSet(
    		   new Comparator<Person>() {
				@Override
				public int compare(Person o1, Person o2) {
					 return o1.getAge()-o2.getAge();
				}
			   }
    		   );
       ts.add(p);       
       ts.add(p1);
       ts.add(p2);
       ts.add(p3);
       System.err.println(ts);
	}
}
