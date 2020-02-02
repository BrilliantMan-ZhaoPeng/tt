package com.zp.properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用Properties输出到 文件
 * 资源配置文件：properties后缀的
 *
 * @author 25045
 *
 */
public class Demo02 {
  public static void main(String[] args) throws FileNotFoundException, IOException {
	  //创建对象
 	 Properties pro=new Properties();
 	 //存储
 	 pro.setProperty("driver","com.jdbc.mysql.Driver");
 	 pro.setProperty("url","localhost:8080:///test");
 	 pro.setProperty("root","root");
 	 //存放到本地磁盘中去
 	 pro.store(new FileOutputStream(new File("src/db.properties")),"db的配置");
 	 pro.storeToXML(new FileOutputStream(new File("src/db.xml")), "db的配置");
 	 //获取
 	 String url=pro.getProperty("url","test");
 	 System.err.println(url);
}
}
