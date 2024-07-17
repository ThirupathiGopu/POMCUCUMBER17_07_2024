package com.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyReader {

	static Properties pro;
	public PropertyReader(String filename) throws Exception
	{
		String filepath=".//TestData//"+filename+".properties";
		FileInputStream fileinput=new FileInputStream(filepath);
		pro=new Properties();
		pro.load(fileinput);
		
	}
	public String GetData(String key)
	{
		return pro.getProperty(key);
	}
	
}
