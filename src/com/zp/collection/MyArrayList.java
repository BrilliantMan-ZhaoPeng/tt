package com.zp.collection;
import java.util.ArrayList;
import java.util.List;
/**
 * 自定义实现ArrayList
 * @author 25045
 *
 */
public class MyArrayList {
    private Object[] elementData;//存放数据
      
    private int size;  //存放大小
  
	public MyArrayList() {
    	this(10);
    }
    //构造器
    public MyArrayList(int initialCapacity) {
    	if(initialCapacity<0) {
    		try {
    			throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	elementData=new Object[initialCapacity];
    }
    
    public void add(Object obj) {
    	//实现动态数组扩容
    	if(size==elementData.length) {
    		Object[] tempelementData=new Object[size*2];
    		System.arraycopy(elementData,0,tempelementData,0,size);
    		/*for(int i=0;i<elementData.length;i++) {
    			tempelementData[i]=elementData[i];
    		}*/
    		elementData=tempelementData;
    	}
    	elementData[size++]=obj;
    }
    public int getSize() {  //得到元素的个数
		return size;
	}
    public Object get(int index) {//得到值
    	rangeCheck(index);
    	return elementData[index];
    }
    
    public void remove(int index) {//删除指定位置的对象
    	rangeCheck(index);
        if(size-index-1>0) {
        	System.arraycopy(elementData,index+1,elementData,index,size-index-1);
        }
        elementData[--size]=null;
    }
    
    //根据对象删除值
    public void removeobj(Object obj) {
    	for(int i=0;i<size;i++) {
    		if(elementData[i].equals(obj)) {
    			System.err.println("我被执行了");
    			remove(i);
    		}
    	}
    }
    
    //根据索引设置值
    public Object set(int index,Object obj) {
    	rangeCheck(index);
    	Object oldValue=elementData[index];
    	elementData[index]=obj;
    	return oldValue;
    }
    //根据索引添加值
    public void addObj(int index,Object obj) {
    	//实现动态数组扩容
    	if(size==elementData.length) {
    		Object[] tempelementData=new Object[size*2];
    		System.arraycopy(elementData,0,tempelementData,0,size);
    		/*for(int i=0;i<elementData.length;i++) {
    			tempelementData[i]=elementData[i];
    		}*/
    		elementData=tempelementData;
    	}
     	rangeCheck(index);
        System.arraycopy(elementData,index,elementData,index+1,size-index);   	
        elementData[index]=obj;
        size++;
    }
    
    //索引判断
    public void rangeCheck(int index) {
    	if(index<0||index>size) {
    		try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    }
    
    public static void main(String[] args) {
		MyArrayList list=new MyArrayList(2);
		list.add(11111);
		list.add(22222);
		list.removeobj(11111);
		System.err.println(list.get(0));
		System.err.println(list.getSize());
	}
}
