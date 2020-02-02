package com.zp.sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparableString {
 public static void main(String[] args) {
	String []strs= {"asd","aa","a","sgdgf"};//对字符串进行排序
	for(int i=0;i<strs.length-1;i++) {
		for(int j=0;j<strs.length-1-i;j++) {
			if(strs[j].compareTo(strs[j+1])<0){
				String tempString=strs[j];
				strs[j]=strs[j+1];
				strs[j+1]=tempString;
			}
		}
	}
	
	for (String string : strs) {
		System.err.print(" "+string);
	}
	
	System.err.println("-----------------------");
	Date dates[]=new Date[3];
	dates[0]=new Date(System.currentTimeMillis());
	dates[1]=new Date(System.currentTimeMillis()-1000*3);
	dates[2]=new Date(System.currentTimeMillis()+1000*4);
	for(int i=0;i<dates.length-1;i++) {
		for(int j=0;j<dates.length-1-i;j++) {
			if(dates[j].compareTo(dates[j+1])>0){
				Date tempString=dates[j];
				dates[j]=dates[j+1];
				dates[j+1]=tempString;
			}
		}
	}
	for (Date date : dates) {
		SimpleDateFormat format=new SimpleDateFormat("hh:mm:ss");
		System.err.print(" "+format.format(date));
	}
}
}
