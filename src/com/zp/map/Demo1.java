package com.zp.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

/**
 * 统计每个单词出现的次数
 * this is a demo,this is my first demo
 * 存储到map中 
 * key:String
 * value:自定义类型
 * 
 分拣的思路
 1.为所有的key创建容器之后容器存放对应的value
 2.第一次创建容器，并存放value
 第二次，直接使用容器存放值
 * @author 25045
 *
 */
public class Demo1 {
    public static void main(String[] args) {
		 String string="this is a demo this is my first demo";
		 String[] split = string.split(" ");
		 //分拣的思路
		 Map<String,Letter> map=new HashMap<String, Letter>();
         for (String str : split) {
        	//1.为所有的key创建容器之后容器存放对应的value
        	 if(!map.containsKey(str)) {
        		 map.put(str,new Letter());
        	 }
        	 Letter letter = map.get(str);
        	 letter.setCount(letter.getCount()+1);//直接加一就Ok了
         }	
         Set<String> keys=map.keySet();
         for (String key : keys) {
        	 Letter letter = map.get(key);
			System.err.println(key+" "+letter.getCount());
		 }
	}
}
