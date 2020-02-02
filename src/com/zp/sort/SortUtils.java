package com.zp.sort;

import java.util.List;

public class SortUtils{
	/**
	 * Object排序
	 * @param obj
	 */
 public static void sort(Object obj[]) {
	 for(int i=0;i<obj.length-1;i++) {
		 for(int j=0;j<obj.length-1-i;j++) {
			 if(((Comparable) obj[j]) .compareTo(obj[j+1])>0) {
				 Object temp=obj[j];
				 obj[j]=obj[j+1];
				 obj[j+1]=temp;
			 }
		 }
	 }
 }

 /**
  * 泛型排序
  * @param <T>
  * @param obj
  */
 public static <T> void sort1(T[] obj) {
	 for(int i=0;i<obj.length-1;i++) {
		 for(int j=0;j<obj.length-1-i;j++) {
			 if(((Comparable) obj[j]) .compareTo(obj[j+1])>0) {
				 T temp=obj[j];
				 obj[j]=obj[j+1];
				 obj[j+1]=temp;
			 }
		 }
	 }
 }
/**
 * 对list进行排序
 */
 public static <T> void sortList(List<T> list) {
	 //转换为shuzu
	 Object[] obj = list.toArray();
	 sort(obj);
	 //改变容器中对应的值
	 for(int i=0;i<obj.length;i++) {
		 list.set(i,(T)obj[i]);
	 }
}
 
}
