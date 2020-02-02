package com.zp.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {
	  public static void main(String[] args) {
		String str="this is a demo this is my first demo";
		String[] split = str.split(" ");
		Map<String,Integer> map=new HashMap<String,Integer>();
		//1.为所有的key创建容器之后容器存
		/*for (String temp : split) {
			if(!map.containsKey(temp)) {
				map.put(temp,new Integer(0));
			}
			Integer integer = map.get(temp);
			map.put(temp,new Integer(integer+=1));
		}*/
		
		/*2.第一次进入容器就创建,第二次直接用就ok了*/
		for (String temp : split) {
			if(map.get(temp)==null) {
				map.put(temp,new Integer(1));
			}else {
				Integer integer = map.get(temp);
				map.put(temp,new Integer(integer+=1));
			}
		}
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.err.println(key+" "+map.get(key));
		}
	}
}
