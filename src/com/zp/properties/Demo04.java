package com.zp.properties;

import java.io.IOException;
import java.util.Properties;

public class Demo04 {
   public static void main(String[] args) throws IOException {
	Properties pro=new Properties();
	//pro.load(Demo04.class.getResourceAsStream("/com/zp/properties/db.properties"));//
	pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("com/zp/properties/db.properties"));
	System.err.println(pro.getProperty("url","lllllll"));
}
}
