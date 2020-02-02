package com.zp.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestCollections {
	 public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(1);
		Collections.sort(list);
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.err.print(" "+iterator.next());
		}
		Collections.reverse(list);
		Iterator<Integer> iterator1 = list.iterator();
		while(iterator1.hasNext()) {
			System.err.print(" "+iterator1.next());
		}   
		
		//模拟斗地主的洗牌与发牌
		List<Integer> cards=new ArrayList<Integer>();
		for(int i=0;i<54;i++) {
			cards.add(i);
		}
		//开始洗牌
		Collections.shuffle(cards);
		//开始发牌了
		List<Integer> p1=new ArrayList<Integer>();
		List<Integer> p2=new ArrayList<Integer>();
		List<Integer> p3=new ArrayList<Integer>();
		List<Integer> last=new ArrayList<Integer>();
		
		for(int i=0;i<51;i+=3) {
			p1.add(cards.get(i));
			p2.add(cards.get(i+1));
			p3.add(cards.get(i+2));
		}
		last.add(cards.get(51));
		last.add(cards.get(52));
		last.add(cards.get(53));
		System.err.println("---------------------------------------------");
		System.err.println("p1:"+p1);
		System.err.println("p2:"+p2);
		System.err.println("p3:"+p3);
		System.err.println("底牌:"+last);
	}
}  
