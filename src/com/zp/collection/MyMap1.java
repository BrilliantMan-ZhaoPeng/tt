package com.zp.collection;
/**
 * 自定义实现map，存放键，根据键来找到对象，键不能重复
 * 本程序的效率实在太低了
 * @author 25045
 *
 */
public class MyMap1 {
	
    MyEntry [] arr=new MyEntry[1000];//放数据的地方
    
    int  size; //存放大小
    
    /**
     * 存放值
     * @param key
     * @param value
     */
    public  void put(Object key,Object value) {
        MyEntry e=new MyEntry(key,value);
        //解决键值对重复的问题
        for(int i=0;i<size;i++) {
        	if(arr[i].key.equals(key)) {
        		arr[i].value=value;
        		return;
        	}
        }
        arr[size++]=e;
    }
    
    /**
     * 得到值
     * @param key
     * @return
     */
    public Object get(Object key) {
    	for (int i=0;i<size;i++) {
			if(arr[i].key.equals(key)) {
				return arr[i].value;
			}
		}
		return null;
    }
    
    /**
     * 判断是否存在当前的键
     * @param key
     * @return
     */
    public boolean containsKey(Object key) {
    	for (int i=0;i<size;i++) {
			if(arr[i].key.equals(key)) {
				return true;
			}
		}
    	return false;
    }
    
    public static void main(String[] args) {
     MyMap1 map=new MyMap1();
     map.put("1",1);
     map.put("1",2);
     System.err.println(map.get("1"));
	}
}

class MyEntry{
	Object key;
	Object value;
	public Object getKey() {
		return key;
	}
	public void setKey(Object key) {
		this.key = key;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public MyEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	public MyEntry() {
		super();
	}
}