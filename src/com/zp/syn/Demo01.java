package com.zp.syn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01 {
  public static void main(String[] args) {
	 List<String> list=new ArrayList<String>();
	 list.add("a");
	 list.add("b");
	 list.add("c");
	 //list可以同步
	 List<String> synchronizedList = Collections.synchronizedList(list);
	 
}
}
