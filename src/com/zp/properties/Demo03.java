package com.zp.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo03 {
  public static void main(String[] args) throws FileNotFoundException, IOException {
	Properties properties=new Properties();
	//读取
	System.err.println(properties.getProperty("root","root"));
	
}
}
