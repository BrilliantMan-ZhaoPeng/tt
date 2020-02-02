package com.zp.properties;

import java.util.Properties;

/**
 * 资源文件配置的读写
 * 1.key与value只能为字符串
 * 2.存储与读写
 * @author 25045
 *
 */
public class Demo01 {
     public static void main(String[] args) {
		 //创建对象
    	 Properties pro=new Properties();
    	 //存储
    	 pro.setProperty("driver","com.jdbc.mysql.Driver");
    	 pro.setProperty("url","localhost:8080:///test");
    	 pro.setProperty("root","root");
    	 
    	 //获取
    	 String url=pro.getProperty("url","test");
    	 System.err.println(url);
	 }
}
