package com.zp.sort;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestUtils {
  public static void main(String[] args) {
	    Date dates[]=new Date[3];
		dates[0]=new Date(System.currentTimeMillis());
		dates[1]=new Date(System.currentTimeMillis()-1000*3);
		dates[2]=new Date(System.currentTimeMillis()+1000*4);
		SortUtils.sort1(dates);
		for (Date date : dates) {
			SimpleDateFormat format=new SimpleDateFormat("hh:mm:ss");
			System.err.print(" "+format.format(date));
		}   
		
		List<String> list=new ArrayList<String>();
		list.add("aa");
		list.add("ab");
		list.add("ba");
		list.add("a");
		SortUtils.sortList(list);
		for (String string : list) {
			System.err.print(" "+string);
		}
		
}
}
