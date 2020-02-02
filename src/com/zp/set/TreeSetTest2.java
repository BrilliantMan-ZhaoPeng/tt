package com.zp.set;

import java.util.TreeSet;

public class TreeSetTest2 {
   /**
 * @param args
 */
public static void main(String[] args) {
	Student student=new Student("张三",123);
	Student student1=new Student("张er",12);
	Student student2=new Student("zhang",1233);
	Student student3=new Student("asd",123);
	TreeSet<Student> set=new TreeSet<Student>();
	set.add(student);
	set.add(student1);
	set.add(student2);
	set.add(student3);
	System.err.println(set);
}
}
